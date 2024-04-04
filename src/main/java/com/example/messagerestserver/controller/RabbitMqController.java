package com.example.messagerestserver.controller;//package com.example.demo.controller;

import com.example.messagerestserver.dto.RequestDto;
import com.example.messagerestserver.dto.ResponseDto;
import com.example.messagerestserver.feign.dto.FeignResponseDto;
import com.example.messagerestserver.service.RabbitMqAdminService;
import com.example.messagerestserver.service.RabbitMqService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Connection;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
public class RabbitMqController {
    private final RabbitMqService rabbitMqService;
    private final RabbitMqAdminService rabbitMqAdminService;

    @PostMapping("/send-test")
    public ResponseEntity<String> sendMessage(@RequestBody String message) {
        rabbitMqService.sendMessage(message);
        return ResponseEntity.ok("Sent successfully!");
    }


    @GetMapping("/queue/{queueName}/message-count")
    public ResponseEntity<ResponseDto.MqMessageCountResponseDto> getMessageCount(@PathVariable(name = "queueName") String queueName) {
        String messageCount = Integer.toString(rabbitMqAdminService.getMessageCount(queueName));

        return ResponseEntity.ok(ResponseDto.MqMessageCountResponseDto.builder()
                .messageCount(messageCount)
                .queueName(queueName)
                .build());
    }

    @GetMapping("/queue/message-count")
    public ResponseEntity<List<FeignResponseDto.RabbitMQResponseDto>> getQueueAndMessageCount() {
        List<FeignResponseDto.RabbitMQResponseDto> queueNameAndMessageCounts = rabbitMqAdminService.getQueueNameAndMessageCounts();
        return ResponseEntity.ok(queueNameAndMessageCounts);
    }

    @PostMapping("/queue/produce")
    public ResponseEntity<String> producer(@RequestBody RequestDto.MessageRequestDto requestDto) {
        
        // response 형식 필요


        // Producer 생성



//        return ResponseEntity.ok();
        return null;
    }

}
