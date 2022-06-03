package com.codegym.furama_resort_spring.service;

import com.codegym.furama_resort_spring.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    void create(Customer customer);
    List<Customer> findAll();
    void update(Customer customer);
    void delete(Long customerId);
    Customer findById(Long customerId);
}
