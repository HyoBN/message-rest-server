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
        String name;
        int messages;
    }


    @Builder
    @Getter
    @AllArgsConstructor(access = AccessLevel.PROTECTED)
    @NoArgsConstructor(access = AccessLevel. PROTECTED)
    public static class RabbitMQResponseDtoList{
        List<RabbitMQResponseDto> infoList;
    }
}
