package com.revature.services;

import com.revature.models.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    //Logger
    private final Logger logger = LoggerFactory.getLogger(ShippingService.class);

    //Now we need a method that allows us to listen for the kafka message
    @KafkaListener(topics = "orders",groupId = "order-listeners-3",concurrency = "3")
    public void createShippingLabel(Order order){

        logger.info("Order received: Create shipping label for "+order.getEmail());
    }

    //What about the item in general? We need to have the fulfillment center get the items and pack them up

    @Autowired
    private KafkaTemplate<String, Order> kafkaTemplate;

    @KafkaListener(topics = "orders",groupId="order-listeners-2")
    public void createWorkOrder(Order order){
        logger.info("Telling the center to package the following items "+order.getCart());

        this.kafkaTemplate.send("work-orders",order);
    }

}
