package com.codegym.furama_resort_spring.controller;

import com.codegym.furama_resort_spring.entity.*;
import com.codegym.furama_resort_spring.service.RentTypeService;
import com.codegym.furama_resort_spring.service.ResortService;
import com.codegym.furama_resort_spring.service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/resort-service")
public class ResortServiceController {

    @Autowired
    RentTypeService rentTypeService;

    @Autowired
    ServiceTypeService serviceTypeService;

    @Autowired
    ResortService resortService;

    @GetMapping("/list")
    public String showListCustomer(Model model){
        List<ResortServices> resortServices = resortService.findAll();
        model.addAttribute("resortServices", resortServices);
        model.addAttribute("rentType", rentTypeService.findAll());
        model.addAttribute("serviceType", serviceTypeService.findAll());
        return "/resort-service/list";
    }
    @GetMapping("/create")
    public String create(Model model){
        ResortServices resortService = new ResortServices();
        resortService.setRentTypeId(new RentType());
        resortService.setServiceTypeId(new ServiceType());
        model.addAttribute("resortService", resortService);
        model.addAttribute("rentType", rentTypeService.findAll());
        model.addAttribute("serviceType", serviceTypeService.findAll());
        return "/resort-service/create";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute("resortService") ResortServices resortServices, Model model){
        resortService.create(resortServices);
        return "redirect:/resort-service/list";
    }
}
