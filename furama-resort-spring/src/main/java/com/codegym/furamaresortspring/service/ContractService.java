package com.codegym.furamaresortspring.service;

import java.util.List;

import com.codegym.furamaresortspring.entity.Contract;

public interface ContractService {
    List<Contract> findAll();

    void create(Contract contract);
}
