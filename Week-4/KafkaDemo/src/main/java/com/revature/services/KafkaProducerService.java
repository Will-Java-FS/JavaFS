package com.revature.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    //logger
    private static final Logger logger = LoggerFactory.getLogger(KafkaProducerService.class);

    //In this class we want to send off some message to our Kafka Topic (topic is a collection of events)
    //To do this we need to add in a KafkaTemplate

    //We'll do some field injection
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    //we'll make a method that sends a message to out Kafka Topic

    public void sendMessage(String message){
        logger.info("Message sent->"+message);
        this.kafkaTemplate.send("test",message);
    }

}
