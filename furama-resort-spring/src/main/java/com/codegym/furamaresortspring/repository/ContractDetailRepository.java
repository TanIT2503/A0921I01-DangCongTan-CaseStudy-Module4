package com.codegym.furamaresortspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codegym.furamaresortspring.entity.ContractDetail;

@Repository
public interface ContractDetailRepository extends JpaRepository<ContractDetail, Long> {

}
