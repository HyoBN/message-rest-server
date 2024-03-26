package com.example.messagerestserver.repository;

import com.example.messagerestserver.domain.AddressDetail;

import java.util.List;
import java.util.Map;

public interface AddressDetailRepositoryCustom {

    List<AddressDetail> qGetAddressDetail(Map<String, String> params) throws NoSuchFieldException;
}
