package com.codegym.furama_resort_spring.service;

import com.codegym.furama_resort_spring.entity.RentType;
import com.codegym.furama_resort_spring.repository.RentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeServiceImpl implements RentTypeService{

    @Autowired
    RentTypeRepository rentTypeRepository;
    @Override
    public List<RentType> findAll() {
        return rentTypeRepository.findAll();
    }
}
