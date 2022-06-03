package com.codegym.furamaresortspring.repository;

import com.codegym.furamaresortspring.entity.ServiceResort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceResortRepository extends JpaRepository<ServiceResort, Long> {
}
