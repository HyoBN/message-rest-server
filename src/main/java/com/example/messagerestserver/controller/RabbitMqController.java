package com.example.messagerestserver.controller;//package com.example.demo.controller;

import com.example.messagerestserver.service.RabbitMqAdminService;
import com.example.messagerestserver.service.RabbitMqService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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


    @GetMapping("/queue/message-count")
    public ResponseEntity<Integer> getMessageCount() {
        return ResponseEntity.ok(rabbitMqAdminService.getMessageCount("hb"));
    }
}
