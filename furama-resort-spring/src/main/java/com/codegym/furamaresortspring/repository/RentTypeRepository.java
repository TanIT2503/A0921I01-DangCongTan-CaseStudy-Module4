package com.codegym.furamaresortspring.repository;


import com.codegym.furamaresortspring.entity.RentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentTypeRepository extends JpaRepository<RentType, Long> {
}
