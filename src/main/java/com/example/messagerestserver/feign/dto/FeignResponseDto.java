package com.example.messagerestserver.feign.dto;

import lombok.*;

import java.util.List;
import java.util.Map;

public class FeignResponseDto {

    @Builder
    @Getter
    @AllArgsConstructor(access = AccessLevel.PROTECTED)
    @NoArgsConstructor(access = AccessLevel. PROTECTED)
    public static class RabbitMQResponseDto{
//        List<Map<String, String>> queueInfo;


        String name;
        String messages;
    }


    @Builder
    @Getter
    @AllArgsConstructor(access = AccessLevel.PROTECTED)
    @NoArgsConstructor(access = AccessLevel. PROTECTED)
    public static class RabbitMQResponseDtoList{
//        List<Map<String, String>> queueInfo;


        List<RabbitMQResponseDto> infoList;
    }
}
