package com.codegym.furamaresortspring.service;

import com.codegym.furamaresortspring.entity.ServiceResort;

import java.util.List;

public interface ServiceResortService {
    List<ServiceResort> findAll();
    void create(ServiceResort serviceResort);
}
