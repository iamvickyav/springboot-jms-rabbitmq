package com.iamvickyav;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class TopicReceiver1 {

    @JmsListener(destination = "avengers-topic", containerFactory = "jmsPubsubFactory")
    void process(String message){
        System.out.println("Avengers Received Msg in Line 1 : " + message);
    }
}
