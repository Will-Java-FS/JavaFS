package com.revature.services;

import com.revature.models.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    //logger
    private static final Logger logger = LoggerFactory.getLogger(OrderService.class);

    //In this class we want to send off some message to our Kafka Topic (topic is a collection of events)
    //To do this we need to add in a KafkaTemplate

    //We'll do some field injection
    @Autowired
    private KafkaTemplate<String, Order> kafkaTemplate;

    //we'll make a method that sends a message to out Kafka Topic

    public void sendOrder(Order order){
        logger.info("Sent a new order!");

        //We can send te order like we did last time, but we can also use the MassageBuilder API to
        //send a better message if we desire
        Message<Order> message = MessageBuilder
                .withPayload(order)
                .setHeader(KafkaHeaders.TOPIC,"orders")
                .build();

        this.kafkaTemplate.send(message);
    }

}
