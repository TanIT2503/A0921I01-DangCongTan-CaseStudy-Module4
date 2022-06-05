package com.codegym.furamaresortspring.controller;

import com.codegym.furamaresortspring.dto.EmployeeDto;
import com.codegym.furamaresortspring.entity.*;
import com.codegym.furamaresortspring.service.DivisionService;
import com.codegym.furamaresortspring.service.EducationDegreeService;
import com.codegym.furamaresortspring.service.EmployeeService;
import com.codegym.furamaresortspring.service.PositionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	@Autowired
	PositionService positionService;
	@Autowired
	EducationDegreeService educationDegreeService;
	@Autowired
	DivisionService divisionService;

	@GetMapping("/list")
	public String showListEmployee(@RequestParam(defaultValue = "") String key_employeeName, Model model) {
		List<Employee> employees = employeeService.findAllByEmployeeNameContaining(key_employeeName);
		model.addAttribute("employees", employees);
		model.addAttribute("position", positionService.findAll());
		model.addAttribute("educationDegree", educationDegreeService.findAll());
		model.addAttribute("division", divisionService.findAll());
		model.addAttribute("key_employeeName", key_employeeName);
		return "/employee/list";
	}

	@GetMapping("/create")
	public String create(Model model) {
		EmployeeDto employeeDto = new EmployeeDto();
		employeeDto.setDivisionId(new Division());
		employeeDto.setEducationDegreeId(new EducationDegree());
		employeeDto.setPositionId(new Position());
		model.addAttribute("employeeDto", employeeDto);
		model.addAttribute("position", positionService.findAll());
		model.addAttribute("educationDegree", educationDegreeService.findAll());
		model.addAttribute("division", divisionService.findAll());
		return "/employee/create";
	}

	@PostMapping("/create")
	public String create(@ModelAttribute("employeeDto") @Validated EmployeeDto employeeDto, BindingResult bindingResult,
			RedirectAttributes redirectAttributes, Model model) {
		new EmployeeDto().validate(employeeDto, bindingResult);
		if (bindingResult.hasFieldErrors()) {
			model.addAttribute("position", positionService.findAll());
			model.addAttribute("educationDegree", educationDegreeService.findAll());
			model.addAttribute("division", divisionService.findAll());
			return "/employee/create";
		} else {
			Employee employee = new Employee();
			BeanUtils.copyProperties(employeeDto, employee);
			employeeService.create(employee);
			redirectAttributes.addFlashAttribute("message", "Register user: " + employee.getEmployeeName() + " done!");
			return "redirect:/employee/list";
		}
	}

	@GetMapping("/update/{id}")
	public String showUpdate(@PathVariable("id") String employeeId, Model model) {
		EmployeeDto employeeDto = new EmployeeDto();
		employeeDto.setDivisionId(new Division());
		employeeDto.setEducationDegreeId(new EducationDegree());
		employeeDto.setPositionId(new Position());
		model.addAttribute("employeeDto", employeeService.findById(employeeId));
		model.addAttribute("position", positionService.findAll());
		model.addAttribute("educationDegree", educationDegreeService.findAll());
		model.addAttribute("division", divisionService.findAll());
		return "/employee/update";
	}

	@PostMapping("/update")
	public String update(@ModelAttribute("employeeDto") @Validated EmployeeDto employeeDto, BindingResult bindingResult,
			RedirectAttributes redirectAttributes, Model model) {
		new EmployeeDto().validate(employeeDto, bindingResult);
		if (bindingResult.hasFieldErrors()) {
			model.addAttribute("position", positionService.findAll());
			model.addAttribute("educationDegree", educationDegreeService.findAll());
			model.addAttribute("division", divisionService.findAll());
			return "/employee/create";
		} else {
			Employee employee = new Employee();
			BeanUtils.copyProperties(employeeDto, employee);
			employeeService.create(employee);
			redirectAttributes.addFlashAttribute("message", "Register user: " + employee.getEmployeeName() + " done!");
			return "redirect:/employee/list";
		}
	}

	@GetMapping("/delete")
	public String delete(@RequestParam String employeeId) {
		employeeService.delete(employeeId);
		return "redirect:/employee/list";
	}
}
