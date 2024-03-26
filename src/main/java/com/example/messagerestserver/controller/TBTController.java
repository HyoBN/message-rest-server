package com.example.messagerestserver.controller;

import com.example.messagerestserver.domain.TBT_DATA_ALL;
import com.example.messagerestserver.service.TBTService;
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

import org.hibernate.dialect.OracleDialect;

@RestController
@RequiredArgsConstructor
@Slf4j
@Tag(name = "TBT 관련 API 목록", description = "TBT 관련 API 목록입니다.")
public class TBTController {

    private final TBTService tbtService;
    @Operation(summary = "TBT 테이블 전체 조회 API 입니다.", description = "TBT 테이블 전체 조회 API 입니다.")
    @GetMapping("/all-tbt")
    public ResponseEntity<List<TBT_DATA_ALL>> getAllTBT(){
        log.info("요청 받은 시각 : " + new SimpleDateFormat("YYYY. MM. DD HH:mm:ss.SSS").format(System.currentTimeMillis()));

        List<TBT_DATA_ALL> allTBT = tbtService.findAll();
        log.info("응답 시각 : " + new SimpleDateFormat("YYYY. MM. DD HH:mm:ss.SSS").format(System.currentTimeMillis()));

        return ResponseEntity.ok().body(allTBT);
    }

}
