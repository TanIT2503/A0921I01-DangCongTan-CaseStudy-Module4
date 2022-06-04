package com.codegym.furamaresortspring.service;

import com.codegym.furamaresortspring.entity.Employee;

import java.util.List;

public interface EmployeeService {
	public void create(Employee employee);
	List<Employee> findAllByEmployeeNameContaining(String employeeName);
	void update(Employee employee);
	void delete(String employeeId);
	Employee findById(String employeeId);
}
