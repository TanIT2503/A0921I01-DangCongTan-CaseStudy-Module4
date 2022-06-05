package com.codegym.furamaresortspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.codegym.furamaresortspring.entity.Contract;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {

}
