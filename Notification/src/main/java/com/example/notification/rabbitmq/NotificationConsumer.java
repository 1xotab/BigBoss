package com.example.notification.rabbitmq;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class NotificationConsumer {

    @RabbitListener(queues = "notification.queue")
    public void consumer(String s) {

        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }
}
