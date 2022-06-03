package com.codegym.furama_resort_spring.service;

import com.codegym.furama_resort_spring.entity.ServiceType;
import com.codegym.furama_resort_spring.repository.ServiceTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeServiceImpl implements ServiceTypeService{
    @Autowired
    ServiceTypeRepository serviceTypeRepository;
    @Override
    public List<ServiceType> findAll() {
        return serviceTypeRepository.findAll();
    }
}
