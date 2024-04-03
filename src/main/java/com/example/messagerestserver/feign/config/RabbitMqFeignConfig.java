package com.example.messagerestserver.feign.config;

import feign.Logger;
import feign.RequestInterceptor;
import lombok.RequiredArgsConstructor;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

@RequiredArgsConstructor
public class RabbitMqFeignConfig {

    @Value("${spring.rabbitmq.username}")
    private String username;
    @Value("${spring.rabbitmq.password}")
    private String password;

    private String basicAuth(){
        String auth = "Basic "+Base64.encodeBase64String((username + ":" + password).getBytes());
        return auth;
    }
    @Bean
    public RequestInterceptor requestInterceptor(){
        return template -> {
            template.header("Content-Type", "application/json;charset=UTF-8");
            template.header("Authorization", basicAuth());
        };
    }

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
