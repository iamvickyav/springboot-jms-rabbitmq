package com.iamvickyav;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class QueueReceiver {

    @JmsListener(destination = "quantum-realm-queue", containerFactory = "jmsQueueFactory")
    void process(String message){
        System.out.println("Thor received message : " + message);
    }
}
