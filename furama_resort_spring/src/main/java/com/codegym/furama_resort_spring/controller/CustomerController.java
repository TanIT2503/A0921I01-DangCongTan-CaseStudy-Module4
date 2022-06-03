package com.codegym.furama_resort_spring.controller;

import com.codegym.furama_resort_spring.dto.CustomerDto;
import com.codegym.furama_resort_spring.dto.CustomerTypeDto;
import com.codegym.furama_resort_spring.entity.Customer;
import com.codegym.furama_resort_spring.entity.CustomerType;
import com.codegym.furama_resort_spring.repository.CustomerTypeRepository;
import com.codegym.furama_resort_spring.service.CustomerService;
import com.codegym.furama_resort_spring.service.CustomerTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    CustomerTypeService customerTypeService;
    @Autowired
    CustomerTypeRepository customerTypeRepository;

    @GetMapping("/home")
    public String showListCustomer(Model model){
        List<Customer>customers = customerService.findAll();
        model.addAttribute("customers", customers);
        model.addAttribute("customerType", customerTypeService.findAll());
        return "/customer/home";
    }

    @GetMapping("/create")
    public String create(Model model){
        CustomerDto customerDto = new CustomerDto();
        customerDto.setCustomerTypeId(new CustomerTypeDto());
        model.addAttribute("customerDto", customerDto);
        model.addAttribute("customerTypeDto", customerTypeService.findAll());
        return "/customer/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("customerDto") @Validated CustomerDto customerDto, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model){
        new CustomerDto().validate(customerDto, bindingResult);
        if (bindingResult.hasFieldErrors()){
            return "/customer/create";
        } else {
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto, customer);
            customerService.create(customer);
            redirectAttributes.addFlashAttribute("message", "Register user: " + customer.getCustomerName()+ " done!");
            return "redirect:/customer/home";
        }
    }

    @GetMapping("/update-customer/{id}")
    public String showUpdate(@PathVariable("id") Long customerId, Model model) {
        Customer customer = new Customer();
        customer.setCustomerTypeId(new CustomerType());
        model.addAttribute("customerType", customerTypeService.findAll());
        model.addAttribute("customer", customerService.findById(customerId));
        return "/customer/update-customer";
    }
    @PostMapping("/update-customer")
    public String update(@ModelAttribute("customer") Customer customer){
        customerService.update(customer);
        return "redirect:/customer/home";
    }

    @GetMapping("/delete-customer")
    public String delete(@RequestParam Long customerId) {
        customerService.delete(customerId);
        return "redirect:/customer/home";
    }
}
