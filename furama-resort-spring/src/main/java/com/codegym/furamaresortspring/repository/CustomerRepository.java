package com.codegym.furamaresortspring.repository;


import com.codegym.furamaresortspring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
	@Query(value = "SELECT * FROM customer where (customer_name like concat('%',:customer_name,'%'))",
			nativeQuery = true)
	List<Customer> findAllByNameAndType(@Param("customer_name") String customerName);
}