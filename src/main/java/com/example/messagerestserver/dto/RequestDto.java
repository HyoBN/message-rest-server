package com.example.messagerestserver.dto;

import lombok.*;

public class RequestDto {
    @Builder
    @Getter
    @AllArgsConstructor(access = AccessLevel.PROTECTED)
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class MessageRequestDto{
        private String num;
        private String cmd;
        private String usm;
        private String ne;
    }
}
