package com.example.messagerestserver.feign;

import com.example.messagerestserver.feign.config.RabbitMqFeignConfig;
import com.example.messagerestserver.feign.dto.FeignResponseDto;
import org.json.simple.JSONArray;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import springfox.documentation.spring.web.json.Json;

import java.util.List;
import java.util.Map;

@FeignClient(name = "RabbitMqFeign", url = "${spring.rabbitmq.endpoint}", configuration = RabbitMqFeignConfig.class)
@Component
public interface RabbitMqFeignClient {

//    @GetMapping("/api/queues/%2F?page=1&page_size=50")
//    FeignResponseDto.RabbitMQResponseDto getQueuesInfo();

//    @GetMapping("/api/queues/%2F?page=1&page_size=50")
//    FeignResponseDto.RabbitMQResponseDtoList getQueuesInfo();


    @GetMapping("/api/queues/%2F")
    List<FeignResponseDto.RabbitMQResponseDto> getQueuesInfo();

}