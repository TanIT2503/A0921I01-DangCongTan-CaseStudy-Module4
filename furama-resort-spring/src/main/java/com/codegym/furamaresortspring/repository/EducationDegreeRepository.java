package com.codegym.furamaresortspring.repository;

import com.codegym.furamaresortspring.entity.EducationDegree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationDegreeRepository extends JpaRepository<EducationDegree, Long> {
}
