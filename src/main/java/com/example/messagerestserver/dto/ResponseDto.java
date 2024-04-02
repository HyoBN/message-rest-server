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

    @Builder
    @Getter
    @AllArgsConstructor(access = AccessLevel.PROTECTED)
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class MqMessageProducingDto {
        private String num;
        private String cmd;
        private String param;
        private String usm;
        private String ne;
        private String RqstQ_send_time;
    }
}
