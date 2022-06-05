package com.codegym.furamaresortspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codegym.furamaresortspring.entity.ContractDetail;
import com.codegym.furamaresortspring.repository.ContractDetailRepository;

@Service
public class ContractDetailServiceImpl implements ContractDetailService {

    @Autowired
    private ContractDetailRepository contractDetailRepository;

    @Override
    public List<ContractDetail> findAll() {
        return contractDetailRepository.findAll();
    }

    @Override
    public void create(ContractDetail contractDetail) {
        contractDetailRepository.save(contractDetail);
    }

}
