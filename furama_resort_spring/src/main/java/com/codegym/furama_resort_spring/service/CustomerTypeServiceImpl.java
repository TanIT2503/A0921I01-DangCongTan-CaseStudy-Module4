package com.codegym.furama_resort_spring.service;

import com.codegym.furama_resort_spring.entity.CustomerType;
import com.codegym.furama_resort_spring.repository.CustomerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerTypeServiceImpl implements CustomerTypeService{
    @Autowired
    CustomerTypeRepository customerTypeRepository;

    @Override
    public List<CustomerType> findAll() {
        return customerTypeRepository.findAll();
    }
}
