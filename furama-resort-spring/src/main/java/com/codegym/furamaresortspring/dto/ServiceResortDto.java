package com.codegym.furamaresortspring.dto;

import com.codegym.furamaresortspring.entity.Contract;
import com.codegym.furamaresortspring.entity.RentType;
import com.codegym.furamaresortspring.entity.ServiceType;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

public class ServiceResortDto implements Validator {

	private Long serviceResortId;
	@NotEmpty(message = "Do not empty.")
	private String serviceResortName;
	private float serviceResortArea;
	private double serviceResortCost;
	@Min(value = 0, message = "Not less than 0.")
	private int serviceResortMaxPeople;
	private String standardRoom;
	private String descriptionOtherConvenience;
	private float poolArea;
	@Min(value = 0, message = "Not less than 0.")
	private int numberOfFloors;

	private ServiceType serviceTypeId;

	private RentType rentTypeId;
	List<Contract> contractList = new ArrayList<>();

	public ServiceResortDto() {
	}

	public ServiceResortDto(Long serviceResortId , String serviceResortName , float serviceResortArea , double serviceResortCost , int serviceResortMaxPeople , String standardRoom , String descriptionOtherConvenience , float poolArea , int numberOfFloors , ServiceType serviceTypeId , RentType rentTypeId , List<Contract> contractList) {
		this.serviceResortId = serviceResortId;
		this.serviceResortName = serviceResortName;
		this.serviceResortArea = serviceResortArea;
		this.serviceResortCost = serviceResortCost;
		this.serviceResortMaxPeople = serviceResortMaxPeople;
		this.standardRoom = standardRoom;
		this.descriptionOtherConvenience = descriptionOtherConvenience;
		this.poolArea = poolArea;
		this.numberOfFloors = numberOfFloors;
		this.serviceTypeId = serviceTypeId;
		this.rentTypeId = rentTypeId;
		this.contractList = contractList;
	}

	public Long getServiceResortId() {
		return serviceResortId;
	}

	public void setServiceResortId(Long serviceResortId) {
		this.serviceResortId = serviceResortId;
	}

	public String getServiceResortName() {
		return serviceResortName;
	}

	public void setServiceResortName(String serviceResortName) {
		this.serviceResortName = serviceResortName;
	}

	public float getServiceResortArea() {
		return serviceResortArea;
	}

	public void setServiceResortArea(float serviceResortArea) {
		this.serviceResortArea = serviceResortArea;
	}

	public double getServiceResortCost() {
		return serviceResortCost;
	}

	public void setServiceResortCost(double serviceResortCost) {
		this.serviceResortCost = serviceResortCost;
	}

	public int getServiceResortMaxPeople() {
		return serviceResortMaxPeople;
	}

	public void setServiceResortMaxPeople(int serviceResortMaxPeople) {
		this.serviceResortMaxPeople = serviceResortMaxPeople;
	}

	public String getStandardRoom() {
		return standardRoom;
	}

	public void setStandardRoom(String standardRoom) {
		this.standardRoom = standardRoom;
	}

	public String getDescriptionOtherConvenience() {
		return descriptionOtherConvenience;
	}

	public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
		this.descriptionOtherConvenience = descriptionOtherConvenience;
	}

	public float getPoolArea() {
		return poolArea;
	}

	public void setPoolArea(float poolArea) {
		this.poolArea = poolArea;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public void setNumberOfFloors(int numberOfFloors) {
		this.numberOfFloors = numberOfFloors;
	}

	public ServiceType getServiceTypeId() {
		return serviceTypeId;
	}

	public void setServiceTypeId(ServiceType serviceTypeId) {
		this.serviceTypeId = serviceTypeId;
	}

	public RentType getRentTypeId() {
		return rentTypeId;
	}

	public void setRentTypeId(RentType rentTypeId) {
		this.rentTypeId = rentTypeId;
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
