package com.microservices.taskcoordinator.dto.inbound;

import com.microservices.taskcoordinator.dto.OrderDetailDTO;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class OrderDTO {

    private int orderId;
    private List<OrderDetailDTO> details;
}
