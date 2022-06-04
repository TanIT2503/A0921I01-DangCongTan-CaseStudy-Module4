package com.codegym.furamaresortspring.service;

import com.codegym.furamaresortspring.entity.EducationDegree;
import com.codegym.furamaresortspring.repository.EducationDegreeRepository;
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
