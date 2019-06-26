package com.microservices.taskcoordinator.entity;

import com.microservices.taskcoordinator.dto.OrderDetailDTO;
import com.microservices.taskcoordinator.dto.inbound.OrderDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class OrderEntity {

    @Id
    private int id;

    private int laundryId;

    private int bucket;

    private long duration;

    @Enumerated(value = EnumType.STRING)
    private OrderStatus status;

    private long estimatedTime;

    private long completionTime;

    public OrderEntity(OrderDTO orderDTO, int selectedLaundryId, long estimatedTimeToComplete) {
        this.id = orderDTO.getOrderId();
        this.laundryId = selectedLaundryId;
        this.duration = orderDTO.getDetails().stream()
                .map(OrderDetailDTO::getDuration)
                .reduce(0L, Long::sum);
        this.status = OrderStatus.APPROVED;
        this.estimatedTime = estimatedTimeToComplete;
    }

}
