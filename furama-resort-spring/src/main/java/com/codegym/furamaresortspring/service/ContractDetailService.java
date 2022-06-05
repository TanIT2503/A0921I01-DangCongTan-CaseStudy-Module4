package com.codegym.furamaresortspring.service;

import java.util.List;

import com.codegym.furamaresortspring.entity.ContractDetail;

public interface ContractDetailService {
    List<ContractDetail> findAll();

    void create(ContractDetail contractDetail);
}
