package com.codegym.furamaresortspring.controller;

import java.util.List;

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

import com.codegym.furamaresortspring.dto.ContractDetailDto;
import com.codegym.furamaresortspring.entity.AttachService;
import com.codegym.furamaresortspring.entity.Contract;
import com.codegym.furamaresortspring.entity.ContractDetail;
import com.codegym.furamaresortspring.service.AttachServiceService;
import com.codegym.furamaresortspring.service.ContractDetailService;

@Controller
@RequestMapping("/contractdetail")
public class ContractDetailController {
    @Autowired
    private ContractDetailService contractDetailService;
    @Autowired
    private AttachServiceService attachServiceService;

    @GetMapping("/list")
    public String listContractDetail(Model model) {
        List<ContractDetail> contractDetails = contractDetailService.findAll();
        model.addAttribute("contractDetails", contractDetails);
        model.addAttribute("attachServiceService", attachServiceService.findAll());
        return "/contractdetail/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        ContractDetailDto contractDetailDto = new ContractDetailDto();
        contractDetailDto.setContractId(new Contract());
        contractDetailDto.setAttachServiceId(new AttachService());
        model.addAttribute("contractDetailDto", contractDetailDto);
        model.addAttribute("contract", contractDetailService.findAll());
        model.addAttribute("attachService", attachServiceService.findAll());
        return "/contractdetail/create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("contractDetailDto") @Validated ContractDetailDto contractDetailDto,
            BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        new ContractDetailDto().validate(contractDetailDto, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute("contract", contractDetailService.findAll());
            model.addAttribute("attachService", attachServiceService.findAll());
            return "/contractdetail/create";
        } else {
            ContractDetail contractDetail = new ContractDetail();
            BeanUtils.copyProperties(contractDetailDto, contractDetail);
            contractDetailService.create(contractDetail);
            redirectAttributes.addFlashAttribute("message",
                    "Create Contract detail: " + contractDetail.getContactDetailId() + " done!");
            return "redirect:/contractdetail/list";
        }
    }
}
