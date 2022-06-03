package com.codegym.furama_resort_spring.service;

import com.codegym.furama_resort_spring.entity.EducationDegree;
import com.codegym.furama_resort_spring.repository.EducationDegreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeServiceImpl implements EducationDegreeService{
	@Autowired
	EducationDegreeRepository educationDegreeRepository;

	@Override
	public List<EducationDegree> findAll() {
		return educationDegreeRepository.findAll();
	}
}
