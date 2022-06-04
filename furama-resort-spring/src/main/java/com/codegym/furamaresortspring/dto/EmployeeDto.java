package com.codegym.furamaresortspring.dto;

import com.codegym.furamaresortspring.entity.*;
import com.fasterxml.jackson.annotation.JsonBackReference;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeDto implements Validator {
//	@Pattern(regexp = "^([NV-])[0-9]{4}$", message = "Employee Id is not in the correct format.")
	private String employeeId;

	@NotEmpty(message = "Do not empty.")
	@Size(min = 2, max = 45, message = "The name is too long or too short.")
	private String employeeName;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date employeeBirthday;

	@Pattern(regexp = "^([0-9]{9})||([0-9]{12})$", message = "Wrong identifier format.")
	private String employeeIdentifyCard;

	@Min(value = 0, message = "Not less than 0.")
	private double employeeSalary;

	@NotBlank(message = "Do not empty.")
//	@Pattern(regexp = "^(84|0)9([0|1])[0-9]{7}$", message = "The phone number is not in the correct format.")
	private String employeeNumberPhone;

	@NotBlank(message = "Do not empty.")
	@Pattern(regexp = "(\\W|^)[\\w.+\\-]*@gmail\\.com(\\W|$)", message = "The email is not in the correct format.")
	private String employeeEmail;

	private String employeeAddress;

	private Position positionId;

	private EducationDegree educationDegreeId;

	private Division divisionId;

	private User userName;

	List<Contract> contractList = new ArrayList<>();

	public EmployeeDto() {
	}

	public EmployeeDto(String employeeId , String employeeName , Date employeeBirthday , String employeeIdentifyCard , double employeeSalary , String employeeNumberPhone , String employeeEmail , String employeeAddress , Position positionId , EducationDegree educationDegreeId , Division divisionId , User userName , List<Contract> contractList) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeBirthday = employeeBirthday;
		this.employeeIdentifyCard = employeeIdentifyCard;
		this.employeeSalary = employeeSalary;
		this.employeeNumberPhone = employeeNumberPhone;
		this.employeeEmail = employeeEmail;
		this.employeeAddress = employeeAddress;
		this.positionId = positionId;
		this.educationDegreeId = educationDegreeId;
		this.divisionId = divisionId;
		this.userName = userName;
		this.contractList = contractList;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Date getEmployeeBirthday() {
		return employeeBirthday;
	}

	public void setEmployeeBirthday(Date employeeBirthday) {
		this.employeeBirthday = employeeBirthday;
	}

	public String getEmployeeIdentifyCard() {
		return employeeIdentifyCard;
	}

	public void setEmployeeIdentifyCard(String employeeIdentifyCard) {
		this.employeeIdentifyCard = employeeIdentifyCard;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeNumberPhone() {
		return employeeNumberPhone;
	}

	public void setEmployeeNumberPhone(String employeeNumberPhone) {
		this.employeeNumberPhone = employeeNumberPhone;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public Position getPositionId() {
		return positionId;
	}

	public void setPositionId(Position positionId) {
		this.positionId = positionId;
	}

	public EducationDegree getEducationDegreeId() {
		return educationDegreeId;
	}

	public void setEducationDegreeId(EducationDegree educationDegreeId) {
		this.educationDegreeId = educationDegreeId;
	}

	public Division getDivisionId() {
		return divisionId;
	}

	public void setDivisionId(Division divisionId) {
		this.divisionId = divisionId;
	}

	public User getUserName() {
		return userName;
	}

	public void setUserName(User userName) {
		this.userName = userName;
	}

	public List<Contract> getContractList() {
		return contractList;
	}

	public void setContractList(List<Contract> contractList) {
		this.contractList = contractList;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return false;
	}

	@Override
	public void validate(Object target , Errors errors) {

	}
}
