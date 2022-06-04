package com.codegym.furamaresortspring.dto;

import com.codegym.furamaresortspring.entity.Contract;
import com.codegym.furamaresortspring.entity.CustomerType;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerDto implements Validator {

	@Pattern(regexp = "^([KH-][0-9]{4})$", message = "Customer Id is not in the correct format.")
	private String customerId;

	@NotEmpty(message = "Do not empty.")
	@Size(min = 2, max = 45, message = "The name is too long or too short.")
	private String customerName;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
//    @Pattern(regexp = "^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$", message = "Wrong Format Date.")
	private Date customerBirthDate;
	private boolean customerGender;

	@Pattern(regexp = "^([0-9]{9})||([0-9]{12})$", message = "Wrong identifier format.")
	private String customerIdentityCard;

	@Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "Wrong Email Format.")
	private String customerEmail;
	private String customerAddress;

	List<Contract> contractDtoList = new ArrayList<>();

	private CustomerType customerTypeId;

	public CustomerDto() {
	}

	public CustomerDto(String customerId , String customerName , Date customerBirthDate , boolean customerGender , String customerIdentityCard , String customerEmail , String customerAddress , List<Contract> contractDtoList , CustomerType customerTypeId) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerBirthDate = customerBirthDate;
		this.customerGender = customerGender;
		this.customerIdentityCard = customerIdentityCard;
		this.customerEmail = customerEmail;
		this.customerAddress = customerAddress;
		this.contractDtoList = contractDtoList;
		this.customerTypeId = customerTypeId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Date getCustomerBirthDate() {
		return customerBirthDate;
	}

	public void setCustomerBirthDate(Date customerBirthDate) {
		this.customerBirthDate = customerBirthDate;
	}

	public boolean isCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(boolean customerGender) {
		this.customerGender = customerGender;
	}

	public String getCustomerIdentityCard() {
		return customerIdentityCard;
	}

	public void setCustomerIdentityCard(String customerIdentityCard) {
		this.customerIdentityCard = customerIdentityCard;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public List<Contract> getContractDtoList() {
		return contractDtoList;
	}

	public void setContractDtoList(List<Contract> contractDtoList) {
		this.contractDtoList = contractDtoList;
	}

	public CustomerType getCustomerTypeId() {
		return customerTypeId;
	}

	public void setCustomerTypeId(CustomerType customerTypeId) {
		this.customerTypeId = customerTypeId;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return false;
	}

	@Override
	public void validate(Object target , Errors errors) {

	}
}
