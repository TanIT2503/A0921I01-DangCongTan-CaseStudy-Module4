package com.codegym.furamaresortspring.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.codegym.furamaresortspring.dto.ContractDto;
import com.codegym.furamaresortspring.entity.Contract;
import com.codegym.furamaresortspring.entity.Customer;
import com.codegym.furamaresortspring.entity.Employee;
import com.codegym.furamaresortspring.entity.ServiceResort;
import com.codegym.furamaresortspring.service.ContractService;
import com.codegym.furamaresortspring.service.CustomerService;
import com.codegym.furamaresortspring.service.EmployeeService;
import com.codegym.furamaresortspring.service.ServiceResortService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/contract")
public class ContractController {

    @Autowired
    private ContractService contractService;
    @Autowired
    private CustomerService customerService;
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ServiceResortService serviceResortService;

    @GetMapping("/list")
    public String listContract(Model model) {
        List<Contract> contracts = contractService.findAll();
        model.addAttribute("contracts", contracts);
        model.addAttribute("customers", customerService.findAll());
        model.addAttribute("employees", employeeService.findAll());
        model.addAttribute("serviceResort", serviceResortService.findAll());
        return "/contract/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        ContractDto contractDto = new ContractDto();
        contractDto.setCustomerId(new Customer());
        contractDto.setEmployeeId(new Employee());
        contractDto.setServiceResortId(new ServiceResort());
        model.addAttribute("contractDto", contractDto);
        model.addAttribute("customer", customerService.findAll());
        model.addAttribute("employee", employeeService.findAll());
        model.addAttribute("serviceResort", serviceResortService.findAll());
        return "/contract/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("contractDto") @Validated ContractDto contractDto,
            BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        new ContractDto().validate(contractDto, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("customer", customerService.findAll());
            model.addAttribute("employee", employeeService.findAll());
            model.addAttribute("serviceResort", serviceResortService.findAll());
            return "/contract/create";
        } else {
            Contract contract = new Contract();
            BeanUtils.copyProperties(contractDto, contract);
            contractService.create(contract);
            redirectAttributes.addFlashAttribute("message",
                    "Create Contract: " + contract.getContractId() + " done!");
            return "redirect:/contract/list";
        }
    }
}
