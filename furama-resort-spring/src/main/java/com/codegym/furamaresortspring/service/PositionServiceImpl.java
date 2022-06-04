package com.codegym.furamaresortspring.service;

import com.codegym.furamaresortspring.entity.Position;
import com.codegym.furamaresortspring.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService{
	@Autowired
	PositionRepository positionRepository;
	@Override
	public List<Position> findAll() {
		return null;
	}
}
