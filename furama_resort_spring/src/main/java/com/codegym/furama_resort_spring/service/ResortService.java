package com.codegym.furama_resort_spring.service;

import com.codegym.furama_resort_spring.entity.ResortServices;

import java.util.List;

public interface ResortService {
    List<ResortServices> findAll();
    void create(ResortServices resortServices);
}
