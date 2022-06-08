package com.codegym.furamaresortspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codegym.furamaresortspring.dto.CustomerUseServiceResortDto;
import com.codegym.furamaresortspring.service.AttachServiceService;
import com.codegym.furamaresortspring.service.ContractDetailService;
import com.codegym.furamaresortspring.service.ContractService;
import com.codegym.furamaresortspring.service.CustomerService;
import com.codegym.furamaresortspring.service.CustomerTypeService;
import com.codegym.furamaresortspring.service.CustomerUseServiceResortService;
import com.codegym.furamaresortspring.service.RentTypeService;
import com.codegym.furamaresortspring.service.ServiceResortService;
import com.codegym.furamaresortspring.service.ServiceTypeService;

@Controller
@RequestMapping("/customer-use-service")
public class CustomerUseService {
    @Autowired
    private CustomerUseServiceResortService customerUseServiceResortService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CustomerTypeService customerTypeService;

    @Autowired
    private ContractService contractService;

    @Autowired
    private ServiceResortService serviceResortService;

    @Autowired
    private RentTypeService rentTypeService;

    @Autowired
    private ServiceTypeService serviceTypeService;

    @Autowired
    private ContractDetailService contractDetailService;

    @Autowired
    private AttachServiceService attachServiceService;

    @GetMapping("/list")
    public String list(Model model) {
        List<CustomerUseServiceResortDto> customerUseServiceResortDtos = customerUseServiceResortService.findAll();
        model.addAttribute("customerUseServiceResortDtos", customerUseServiceResortDtos);
        model.addAttribute("customers", customerService.findAll());
        model.addAttribute("customerTypes", customerTypeService.findAll());
        model.addAttribute("contracts", contractService.findAll());
        model.addAttribute("serviceResorts", serviceResortService.findAll());
        model.addAttribute("rentTypes", rentTypeService.findAll());
        model.addAttribute("serviceTypes", serviceTypeService.findAll());
        model.addAttribute("contractDetails", contractDetailService.findAll());
        model.addAttribute("attachServices", attachServiceService.findAll());
        return "customer-use-service/list";
    }
}
