package com.example.messagerestserver.service;

import com.example.messagerestserver.converter.RabbitMqConverter;
import com.example.messagerestserver.dto.ResponseDto;
import com.example.messagerestserver.feign.RabbitMqFeignClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Properties;

@Service
@Slf4j
@RequiredArgsConstructor
public class RabbitMqAdminService {

    private final AmqpAdmin amqpAdmin;
    private final RabbitMqFeignClient rabbitMqFeignClient;

//    public RabbitMqAdminService(ConnectionFactory connectionFactory) {
//        this.amqpAdmin = new RabbitAdmin(connectionFactory);
//    }

    public int getMessageCount(String queueName) {
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


    public List<ResponseDto.MqMessageCountResponseDto> getQueueNameAndMessageCounts() {
        List<Map<String, String>> queuesInfo = rabbitMqFeignClient.getQueuesInfo();

        return RabbitMqConverter.getQueueAndCountList(queuesInfo);
    }
}