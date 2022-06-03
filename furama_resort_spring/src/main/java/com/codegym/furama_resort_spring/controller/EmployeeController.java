package com.codegym.furama_resort_spring.controller;

import com.codegym.furama_resort_spring.service.DivisionService;
import com.codegym.furama_resort_spring.service.EducationDegreeService;
import com.codegym.furama_resort_spring.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	DivisionService divisionService;

	@Autowired
	EducationDegreeService educationDegreeService;

	@Autowired
	PositionService positionService;
}
