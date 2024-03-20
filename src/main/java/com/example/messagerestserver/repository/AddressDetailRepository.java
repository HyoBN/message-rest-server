package com.example.messagerestserver.repository;

import com.example.messagerestserver.domain.AddressDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressDetailRepository extends JpaRepository<AddressDetail, Long> {

}
