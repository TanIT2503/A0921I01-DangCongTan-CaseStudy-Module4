package com.codegym.furamaresortspring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.codegym.furamaresortspring.dto.CustomerUseServiceResortDto;

@Repository
public interface CustomerUseServiceResortRepository extends JpaRepository<CustomerUseServiceResortDto, Long> {
    @Query("from Customer.c join CustomerType.ct join Contract.co join ServiceResort.sr join RentType.rt join ServiceType.st join ContractDetail.cd join AttachService.as")
    List<CustomerUseServiceResortDto> findAll();
}
