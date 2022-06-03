package com.codegym.furama_resort_spring.repository;

import com.codegym.furama_resort_spring.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepository extends JpaRepository<Position, Long> {
}
