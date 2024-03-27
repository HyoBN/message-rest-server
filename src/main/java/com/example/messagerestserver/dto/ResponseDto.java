package com.example.messagerestserver.dto;


import lombok.*;

public class ResponseDto {

    @Builder
    @Getter
    @AllArgsConstructor(access = AccessLevel.PROTECTED)
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class MqMessageCountResponseDto {
        private String queueName;
        private int messageCount;
    }
}
