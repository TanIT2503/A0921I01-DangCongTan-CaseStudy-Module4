package com.codegym.furamaresortspring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.codegym.furamaresortspring.dto.CustomerUseServiceResortDto;
import com.codegym.furamaresortspring.repository.CustomerUseServiceResortRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerUseServiceResortServiceImpl implements CustomerUseServiceResortService {
    @Autowired
    CustomerUseServiceResortRepository customerUseServiceResortRepository;;

    @Override
    public List<CustomerUseServiceResortDto> findAll() {
        return customerUseServiceResortRepository.findAll();
    }
}
