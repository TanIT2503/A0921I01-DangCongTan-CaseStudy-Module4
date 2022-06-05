package com.codegym.furamaresortspring.service;

import com.codegym.furamaresortspring.entity.Customer;

import java.util.List;

public interface CustomerService {
    void create(Customer customer);

    List<Customer> findAllByNameAndType(String customerName);

    void update(Customer customer);

    void delete(String customerId);

    Customer findById(String customerId);

    List<Customer> findAll();

}
