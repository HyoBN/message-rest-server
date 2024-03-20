package com.example.messagerestserver.controller;

import com.example.messagerestserver.domain.AddressDetail;
import com.example.messagerestserver.service.AddressDetailService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@Slf4j
@Tag(name = "Address Detail 관련 API 목록", description = "Address Detail 관련 API 목록입니다.")
public class EsoController {
    private final AddressDetailService addressDetailService;

    @Operation(summary = "Address Detail 테이블 전체 조회 API 입니다.", description = "Address Detail 테이블 전체 조회 API 입니다.")
    @GetMapping("/all-address-detail")
    public ResponseEntity<List<AddressDetail>> getAllAddressDetail(){
        log.info("요청 받은 시각 : " + new SimpleDateFormat("YYYY. MM. DD HH:mm:ss.SSS").format(System.currentTimeMillis()));

        List<AddressDetail> allAddressDetail = addressDetailService.findAll();
        log.info("응답 시각 : " + new SimpleDateFormat("YYYY. MM. DD HH:mm:ss.SSS").format(System.currentTimeMillis()));

        return ResponseEntity.ok().body(allAddressDetail);
    }

    @Operation(summary = "Address Detail 테이블 조건부 조회 API 입니다.", description = "Address Detail 테이블 조건부 조회 API 입니다.")
    @GetMapping("/address-detail")
    public ResponseEntity<List<AddressDetail>> getAddressDetail(@RequestParam Map<String, String> params) {
        addressDetailService.findAddressDetail(params);
        List<AddressDetail> allAddressDetail = addressDetailService.findAll();

        return ResponseEntity.ok().body(allAddressDetail);
    }
}
