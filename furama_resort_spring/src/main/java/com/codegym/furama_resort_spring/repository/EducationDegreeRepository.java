package com.codegym.furama_resort_spring.repository;

import com.codegym.furama_resort_spring.entity.EducationDegree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationDegreeRepository extends JpaRepository<EducationDegree, Long> {
}
