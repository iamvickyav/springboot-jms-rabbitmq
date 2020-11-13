package com.iamvickyav;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Sender {

    @Autowired
    JmsTemplate jmsTemplate;

    @Scheduled(fixedDelay = 3000)
    void postMessageToQueue() {
        jmsTemplate.convertAndSend("quantum-realm-queue", "SOS from C-53 to Thor, The Strongest Avenger !");
        System.out.println("SOS sent point to point to Thor via Queue");
    }

    @Scheduled(fixedDelay = 2000)
    void postMessageToTopic() {
        jmsTemplate.convertAndSend("avengers-topic", "SOS from C-53 to all Avengers");
        System.out.println("SOS sent to All Avengers via Topic Subscription");
    }
}
