package com.codegym.furamaresortspring.service;

import com.codegym.furamaresortspring.entity.Division;
import com.codegym.furamaresortspring.repository.DivisionRepository;
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
