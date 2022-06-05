package com.codegym.furamaresortspring.service;

import com.codegym.furamaresortspring.entity.Customer;
import com.codegym.furamaresortspring.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void create(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public List<Customer> findAllByNameAndType(String customerName) {
        return customerRepository.findAllByNameAndType(customerName);
    }

    @Override
    public void update(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void delete(String customerId) {
        customerRepository.deleteById(customerId);
    }

    @Override
    public Customer findById(String customerId) {
        return customerRepository.findById(customerId).orElse(null);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

}
