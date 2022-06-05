package com.codegym.furamaresortspring.controller;

import com.codegym.furamaresortspring.dto.CustomerDto;
import com.codegym.furamaresortspring.entity.Customer;
import com.codegym.furamaresortspring.entity.CustomerType;
import com.codegym.furamaresortspring.repository.CustomerTypeRepository;
import com.codegym.furamaresortspring.service.CustomerService;
import com.codegym.furamaresortspring.service.CustomerTypeService;
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
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;
    @Autowired
    CustomerTypeService customerTypeService;
    @Autowired
    CustomerTypeRepository customerTypeRepository;

    @GetMapping("/home")
    public String showListCustomer(@RequestParam(defaultValue = "") String key_customerName, Model model) {
        List<Customer> customers = customerService.findAllByNameAndType(key_customerName);
        model.addAttribute("customers", customers);
        model.addAttribute("customerType", customerTypeService.findAll());
        model.addAttribute("key_customerName", key_customerName);
        return "/customer/home";
    }

    @GetMapping("/create")
    public String create(Model model) {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setCustomerTypeId(new CustomerType());
        model.addAttribute("customerDto", customerDto);
        model.addAttribute("customerType", customerTypeService.findAll());
        return "/customer/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("customerDto") @Validated CustomerDto customerDto, BindingResult bindingResult,
            RedirectAttributes redirectAttributes, Model model) {
        new CustomerDto().validate(customerDto, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("customerType", customerTypeService.findAll());
            return "/customer/create";
        } else {
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto, customer);
            customerService.create(customer);
            redirectAttributes.addFlashAttribute("message", "Register user: " + customer.getCustomerName() + " done!");
            return "redirect:/customer/home";
        }
    }

    @GetMapping("/update-customer/{id}")
    public String showUpdate(@PathVariable("id") String customerId, Model model) {
        CustomerDto customerDto = new CustomerDto();
        customerDto.setCustomerTypeId(new CustomerType());
        model.addAttribute("customerDto", customerService.findById(customerId));
        model.addAttribute("customerType", customerTypeService.findAll());
        return "/customer/update-customer";
    }

    @PostMapping("/update-customer")
    public String update(@ModelAttribute("customerDto") @Validated CustomerDto customerDto, BindingResult bindingResult,
            RedirectAttributes redirectAttributes, Model model) {
        new CustomerDto().validate(customerDto, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("customerType", customerTypeService.findAll());
            return "/customer/update-customer";
        } else {
            Customer customer = new Customer();
            BeanUtils.copyProperties(customerDto, customer);
            customerService.create(customer);
            redirectAttributes.addFlashAttribute("message", "Register user: " + customer.getCustomerName() + " done!");
            return "redirect:/customer/home";
        }
    }

    @GetMapping("/delete-customer")
    public String delete(@RequestParam String customerId) {
        customerService.delete(customerId);
        return "redirect:/customer/home";
    }
}
