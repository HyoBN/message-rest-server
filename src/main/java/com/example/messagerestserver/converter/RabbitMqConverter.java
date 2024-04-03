package com.example.messagerestserver.converter;

import com.example.messagerestserver.dto.ResponseDto;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RequiredArgsConstructor
public class RabbitMqConverter {

    public static List<ResponseDto.MqMessageCountResponseDto> getQueueAndCountList(List<Map<String, String>> queueInfo) {
        List<ResponseDto.MqMessageCountResponseDto> queueAndCountList = new ArrayList<>();

        queueInfo.stream()
                .map(queue -> {
                    String name = queue.get("name");
                    String count = queue.get("messages");
                    queueAndCountList.add(
                            ResponseDto.MqMessageCountResponseDto.builder()
                                    .queueName(name)
                                    .messageCount(count)
                                    .build()
                    );
                    return null;
                }).collect(Collectors.toList());
        return queueAndCountList;
    }
}
