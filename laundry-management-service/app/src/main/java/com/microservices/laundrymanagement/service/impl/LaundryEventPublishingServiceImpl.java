package com.microservices.laundrymanagement.service.impl;

import com.microservices.laundrymanagement.api.messages.LaundryStateWrapper;
import com.microservices.laundrymanagement.api.messages.OrderSubmittedEventWrapper;
import com.microservices.laundrymanagement.entity.EventType;
import com.microservices.laundrymanagement.entity.LaundryEventLogEntity;
import com.microservices.laundrymanagement.entity.LaundryStateEntity;
import com.microservices.laundrymanagement.repository.LaundryEventRepository;
import com.microservices.laundrymanagement.service.LaundryEventPublishingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LaundryEventPublishingServiceImpl implements LaundryEventPublishingService {

    private LaundryEventRepository eventRepository;

    @Autowired
    public LaundryEventPublishingServiceImpl(LaundryEventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    // should be always performed in current transaction if exists to support transactional messaging pattern
    @Transactional(propagation = Propagation.REQUIRED)
    public void buildAndPublishOrderSubmittedEvent(int orderId, LaundryStateEntity laundryState) {
        OrderSubmittedEventWrapper.OrderSubmittedEvent orderSubmittedEvent = OrderSubmittedEventWrapper
                .OrderSubmittedEvent.newBuilder()
                .setOrderId(orderId)
                .setState(LaundryStateWrapper.LaundryState.newBuilder()
                        .setLaundryId(laundryState.getId())
                        .setQueueWaitingTime(laundryState.getQueueWaitingTime())
                        .setVersion(laundryState.getVersion()))
                .build();

        LaundryEventLogEntity event = new LaundryEventLogEntity(
                EventType.ORDER_SUBMITTED_EVENT, orderSubmittedEvent.toByteArray());

        eventRepository.save(event);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void buildAndPublishOrderProcessedEvent(int orderId, LaundryStateEntity laundryState) {
        OrderProcessedEvent.OrderProcessedMessage orderProcessedMessage = OrderProcessedEvent.OrderProcessedMessage.newBuilder()
                .setOrderId(orderId)
                .setCompleteTime(System.currentTimeMillis())
                .setState(LaundryState.LaundryStateMessage.newBuilder()
                        .setLaundryId(laundryState.getId())
                        .setQueueWaitingTime(laundryState.getQueueWaitingTime())
                        .setVersion(laundryState.getVersion()))
                .build();

        LaundryEventLogEntity event = new LaundryEventLogEntity(
                EventType.ORDER_COMPLETED_EVENT, orderProcessedMessage.toByteArray());

        eventRepository.save(event);
    }
}
