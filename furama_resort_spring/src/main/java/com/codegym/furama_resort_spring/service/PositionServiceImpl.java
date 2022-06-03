package com.codegym.furama_resort_spring.service;

import com.codegym.furama_resort_spring.entity.Position;
import com.codegym.furama_resort_spring.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService{
	@Autowired
	PositionRepository positionRepository;

	@Override
	public List<Position> findAll() {
		return positionRepository.findAll();
	}
}
