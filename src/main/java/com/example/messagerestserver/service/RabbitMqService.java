package com.example.messagerestserver.service;//package com.example.demo.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class RabbitMqService {

    @Value("${rabbitmq.queue.queue1.exchange}")
    private String exchangeName;

    @Value("${rabbitmq.queue.routing.key.queue1}")
    private String routingKey;

    private final RabbitTemplate rabbitTemplate;

    public void sendMessage(String message) {
        log.info("message send: {}",message);
        this.rabbitTemplate.convertAndSend(exchangeName,routingKey,message);
    }

    @RabbitListener(queues = "${rabbitmq.queue.queue1.name}")
    public void receiveMessage(String message) {
        log.info("Received Message : {}",message);
    }

}
