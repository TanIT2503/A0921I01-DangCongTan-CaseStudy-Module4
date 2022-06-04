package com.codegym.furamaresortspring.repository;

import com.codegym.furamaresortspring.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {
	List<Employee> findAllByEmployeeNameContaining(String employeeName);
}
