package com.codegym.furama_resort_spring.service;

import com.codegym.furama_resort_spring.entity.Customer;
import com.codegym.furama_resort_spring.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public void create(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public void update(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void delete(Long customerId) {
        customerRepository.deleteById(customerId);
    }

    @Override
    public Customer findById(Long customerId) {
        return customerRepository.findById(customerId).orElse(null);
    }


}
