package com.codegym.furamaresortspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codegym.furamaresortspring.entity.Contract;
import com.codegym.furamaresortspring.repository.ContractRepository;

@Service
public class ContractServiceImpl implements ContractService {

    @Autowired
    private ContractRepository contractRepository;

    @Override
    public List<Contract> findAll() {
        return contractRepository.findAll();
    }

    @Override
    public void create(Contract contract) {
        contractRepository.save(contract);
    }

}
