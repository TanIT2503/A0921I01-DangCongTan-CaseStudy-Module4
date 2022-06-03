package com.codegym.furama_resort_spring.service;

import com.codegym.furama_resort_spring.entity.ResortServices;
import com.codegym.furama_resort_spring.repository.ResortServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResortServiceImpl implements ResortService{
    @Autowired
    ResortServiceRepository resortServiceRepository;
    @Override
    public List<ResortServices> findAll() {
        return resortServiceRepository.findAll();
    }

    @Override
    public void create(ResortServices resortServices) {
        resortServiceRepository.save(resortServices);
    }
}
