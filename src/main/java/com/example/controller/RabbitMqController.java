package com.example.controller;//package com.example.demo.controller;
//
//import com.example.demo.service.RabbitMqService;
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@Slf4j
//@RequiredArgsConstructor
//@RestController
//public class RabbitMqController {
//    private final RabbitMqService rabbitMqService;
//
//    @PostMapping("/send-test")
//    public ResponseEntity<String> sendMessage(@RequestBody String message) {
//        this.rabbitMqService.sendMessage(message);
//        return ResponseEntity.ok("Sent successfully!");
//    }
//
//}
