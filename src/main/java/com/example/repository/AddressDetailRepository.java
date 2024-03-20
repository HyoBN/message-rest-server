package com.example.repository;

import com.example.domain.AddressDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressDetailRepository extends JpaRepository<AddressDetail, Long> {

}
