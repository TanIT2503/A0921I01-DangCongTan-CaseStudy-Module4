package com.codegym.furamaresortspring.repository;

import com.codegym.furamaresortspring.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends JpaRepository<Position, Long> {
}
