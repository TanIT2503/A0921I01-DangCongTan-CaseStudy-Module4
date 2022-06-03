package com.codegym.furama_resort_spring.service;

import com.codegym.furama_resort_spring.entity.Division;
import com.codegym.furama_resort_spring.repository.DivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImpl implements DivisionService{
	@Autowired
	DivisionRepository divisionRepository;

	@Override
	public List<Division> findAll() {
		return divisionRepository.findAll();
	}
}
