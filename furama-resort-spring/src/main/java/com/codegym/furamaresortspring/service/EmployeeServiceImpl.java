package com.codegym.furamaresortspring.service;

import com.codegym.furamaresortspring.entity.Employee;
import com.codegym.furamaresortspring.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void create(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public List<Employee> findAllByEmployeeNameContaining(String employeeName) {
		return employeeRepository.findAllByEmployeeNameContaining(employeeName);
	}

	@Override
	public void update(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void delete(String employeeId) {
		employeeRepository.deleteById(employeeId);
	}

	@Override
	public Employee findById(String employeeId) {
		return employeeRepository.findById(employeeId).orElse(null);
	}

	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}
}
