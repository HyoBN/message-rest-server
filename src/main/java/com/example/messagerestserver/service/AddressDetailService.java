package com.example.messagerestserver.service;

import com.example.messagerestserver.domain.AddressDetail;
import com.example.messagerestserver.repository.AddressDetailRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class AddressDetailService {
    private final AddressDetailRepository addressDetailRepository;

    public List<AddressDetail> findAll(){
        return addressDetailRepository.findAll();
    }

//    public List<AddressDetail> findAddressDetail(Map<String, String> paramMap) {
//        List<Field> addressDetailFields = List.of(AddressDetail.class.getDeclaredFields());
//        List<String> addressDetailFieldsToString = new ArrayList<>();
//        addressDetailFields.stream()
//                .map(field ->
//                {
//                    return addressDetailFieldsToString.add(field.getName());
//                }).collect(Collectors.toList());
//
//        return null;
//
//    }

    public List<AddressDetail> findAddressDetail(Map<String, String> paramMap) throws NoSuchFieldException{
        return addressDetailRepository.qGetAddressDetail(paramMap);
    }
}
