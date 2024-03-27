package com.example.messagerestserver.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.stereotype.Service;

import java.util.Properties;

@Service
@Slf4j
@RequiredArgsConstructor
public class RabbitMqAdminService {

    private final AmqpAdmin amqpAdmin;

//    public RabbitMqAdminService(ConnectionFactory connectionFactory) {
//        this.amqpAdmin = new RabbitAdmin(connectionFactory);
//    }

    public int getMessageCount(String queueName) {
        // RabbitAdmin의 getQueueProperties 메소드를 사용하여 큐의 속성을 조회합니다.
        // "QUEUE_MESSAGE_COUNT" 속성은 큐에 있는 메시지의 개수를 나타냅니다.
        Properties properties = amqpAdmin.getQueueProperties(queueName);
        if (properties != null) {
            Integer messageCount = (Integer) properties.get(RabbitAdmin.QUEUE_MESSAGE_COUNT);
            if (messageCount == null) {
                log.error("Message Null!");
            }
            return messageCount != null ? messageCount : 0;
        }
        return 0;
    }
}