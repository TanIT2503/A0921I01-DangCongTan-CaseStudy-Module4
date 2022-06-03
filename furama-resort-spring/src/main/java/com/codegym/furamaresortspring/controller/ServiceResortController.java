package com.codegym.furamaresortspring.controller;


import com.codegym.furamaresortspring.dto.ServiceResortDto;
import com.codegym.furamaresortspring.entity.*;
import com.codegym.furamaresortspring.service.RentTypeService;
import com.codegym.furamaresortspring.service.ServiceResortService;
import com.codegym.furamaresortspring.service.ServiceTypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/resort-service")
public class ServiceResortController {

    @Autowired
    RentTypeService rentTypeService;

    @Autowired
    ServiceTypeService serviceTypeService;

    @Autowired
    ServiceResortService serviceResortService;

    @GetMapping("/list")
    public String showListService(Model model){
        List<ServiceResort> serviceResortServices = serviceResortService.findAll();
        model.addAttribute("serviceResortServices", serviceResortServices);
        model.addAttribute("rentType", rentTypeService.findAll());
        model.addAttribute("serviceType", serviceTypeService.findAll());
        return "/resort-service/list";
    }

    @GetMapping("/create")
    public String create(Model model){
        ServiceResortDto serviceResortDto = new ServiceResortDto();
        serviceResortDto.setRentTypeId(new RentType());
        serviceResortDto.setServiceTypeId(new ServiceType());
        model.addAttribute("serviceResortDto", serviceResortDto);
        model.addAttribute("rentType", rentTypeService.findAll());
        model.addAttribute("serviceType", serviceTypeService.findAll());
        return "/resort-service/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("serviceResortDto") @Validated ServiceResortDto serviceResortDto , BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model){
        new ServiceResortDto().validate(serviceResortDto , bindingResult);
        if (bindingResult.hasFieldErrors()){
            model.addAttribute("rentType", rentTypeService.findAll());
            model.addAttribute("serviceType", serviceTypeService.findAll());
            return "/resort-service/create";
        } else {
            ServiceResort serviceResort = new ServiceResort();
            BeanUtils.copyProperties(serviceResortDto , serviceResort);
            serviceResortService.create(serviceResort);
            redirectAttributes.addFlashAttribute("message", "Register user: " + serviceResort.getServiceResortName()+ " done!");
            return "redirect:/resort-service/list";
        }
    }

}
