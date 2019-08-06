package com.microservices.ordermanagement.app.entity;

import com.microservices.ordermanagement.api.dto.AssignTariffDto;
import com.microservices.ordermanagement.api.dto.OrderStatus;
import com.microservices.ordermanagement.api.dto.PaymentDetailsDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(value = EnumType.STRING)
    private OrderStatus status = OrderStatus.PENDING;

    private String username;

    private long createdTime = System.currentTimeMillis();

    private long estimatedTime;

    @NonNull
    private BigDecimal totalPrice = BigDecimal.ZERO;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "orderId")
    private List<OrderDetailEntity> detailEntities = new ArrayList<>();

    public OrderEntity(String username) {
        this.username = Objects.requireNonNull(username);
    }

    public void addDetail(PendingDetailEntity pendingDetail) {
        if (detailEntities.stream().anyMatch(d -> d.getId() == pendingDetail.getId())) {
            return;
        }

        detailEntities.add(new OrderDetailEntity(pendingDetail.getId(), this.getId(), pendingDetail.getWeight()));
    }

    public void assignTariffToOrderDetail(AssignTariffDto assignTariffDto) {
        OrderDetailEntity orderDetail = detailEntities.stream()
                .filter(d -> d.getId() == assignTariffDto.getDetailId())
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("There is no detail with id: " +
                        assignTariffDto.getDetailId() + "" + "in order id: " + assignTariffDto.getOrderId() + " in database"));

        orderDetail.addTariffInformation(assignTariffDto.getTariffDto());
        this.setTotalPrice(detailEntities.stream()
                .map(OrderDetailEntity::getPrice)
                .filter(Objects::nonNull)
                .reduce(BigDecimal.ZERO, BigDecimal::add));
    }

    public void checkApproveInvariants(PaymentDetailsDto paymentDetailsDto) {
        if (this.getStatus() != OrderStatus.PENDING) {
            throw new IllegalStateException("Order already not in PENDING status and cannot be approved again");
        }

        if (!this.getDetailEntities().stream()
                .allMatch(OrderDetailEntity::isTariffAssigned)) {
            throw new IllegalStateException("Some of the order's details don't contain tariff info");
        }

        if (!this.getTotalPrice().equals(paymentDetailsDto.getAmount())) {
            throw new IllegalStateException("Order price: " + this.getTotalPrice() +
                    " . Doesn't match payment amount: " + paymentDetailsDto.getAmount());
        }

        if (!this.getUsername().equals(paymentDetailsDto.getUsername())) {
            throw new IllegalStateException("Order user: " + this.getUsername() +
                    " . Doesn't match payment principal: " + paymentDetailsDto.getUsername());
        }
    }
}
