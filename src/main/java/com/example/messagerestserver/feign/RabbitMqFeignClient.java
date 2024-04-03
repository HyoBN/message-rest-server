package com.example.messagerestserver.feign;

import com.example.messagerestserver.feign.config.RabbitMqFeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@FeignClient(name = "RabbitMqFeign", url = "${spring.rabbitmq.endpoint}", configuration = RabbitMqFeignConfig.class)
@Component
public interface RabbitMqFeignClient {

    @GetMapping("/api/queues/%2F")
    List<Map<String, String>> getQueuesInfo();
}