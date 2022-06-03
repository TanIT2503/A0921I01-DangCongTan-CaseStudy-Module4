package com.codegym.furamaresortspring.service;

import com.codegym.furamaresortspring.entity.ServiceResort;
import com.codegym.furamaresortspring.repository.ServiceResortRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceResortServiceImpl implements ServiceResortService {
    @Autowired
    ServiceResortRepository serviceResortRepository;
    @Override
    public List<ServiceResort> findAll() {
        return serviceResortRepository.findAll();
    }

    @Override
    public void create(ServiceResort serviceResort) {
        serviceResortRepository.save(serviceResort);
    }
}
