package com.example.demo.msg;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Producer {

    @Autowired
    RabbitTemplate rabbitTemplate;
    
    private static final String EXCHANGE_NAME = "cafe.topic";
    
    private static final String QUEUE_NAME = "coffee.queue";

    /* rabbitmq 테스트용 계속 자동으로 메시지 쏘는 메소드. 일단 막아놓음
     * @Scheduled(fixedDelay = 1000, initialDelay = 500)
    public void sendMessage(){
        rabbitTemplate.convertAndSend(EXCHANGE_NAME,"myroutingkey", "MessageXX");
    	//rabbitTemplate.convertAndSend(QUEUE_NAME, "Message");
    }*/
}
