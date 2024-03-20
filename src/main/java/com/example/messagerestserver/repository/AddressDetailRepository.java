package com.example.messagerestserver.repository;

import com.example.messagerestserver.domain.AddressDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface AddressDetailRepository extends JpaRepository<AddressDetail, Long>, AddressDetailRepositoryCustom {
}
