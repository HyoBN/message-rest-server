package com.example.service;

import com.example.domain.AddressDetail;
import com.example.repository.AddressDetailRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class AddressDetailService {
    private final AddressDetailRepository addressDetailRepository;

    public List<AddressDetail> findAll(){
        return addressDetailRepository.findAll();
    }
}
