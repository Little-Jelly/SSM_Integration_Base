package com.yyf.controller;

import com.yyf.po.Customer;
import com.yyf.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/findCustomerById")
    public String findCustomerById(Integer id, Model model){
        Customer customer = customerService.findCustomerById(id);
        model.addAttribute("customer", customer);
        return "customer";
//        return "success";
    }
}
