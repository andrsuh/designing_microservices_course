package com.microservices.taskcoordinator.dto;

import com.microservices.taskcoordinator.entity.OrderEntity;
import com.microservices.taskcoordinator.entity.OrderStatus;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.List;
import java.util.stream.Collectors;

@Setter
@Getter
@NoArgsConstructor
@EqualsAndHashCode
public class OrderDto {

    private Integer id;

    private Integer laundryId;

    private Integer bucket;

    private Long duration;

    @Enumerated(value = EnumType.STRING)
    private OrderStatus status;

    private Long estimatedTime;

    private Long completionTime;

    private List<OrderDetailDto> details;

    public OrderDto(OrderEntity orderEntity) {
        this.id = orderEntity.getId();
        this.laundryId = orderEntity.getLaundryId();
        this.bucket = orderEntity.getBucket();
        this.duration = orderEntity.getDuration();
        this.status = orderEntity.getStatus();
        this.estimatedTime = orderEntity.getEstimatedTime();
        this.completionTime = orderEntity.getCompletionTime();

        this.details = orderEntity.getDetails() == null
                ? null
                : orderEntity.getDetails().stream()
                    .map(OrderDetailDto::new)
                    .collect(Collectors.toList());
    }
}
