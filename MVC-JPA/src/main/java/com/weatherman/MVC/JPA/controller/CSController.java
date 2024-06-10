package com.weatherman.MVC.JPA.controller;

import com.weatherman.MVC.JPA.model.CustomerInfo;
import com.weatherman.MVC.JPA.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class CSController
{
    public CSController()
    {
        System.out.println ("registration URL: http://localhost:8080/weatherman/register");
        System.out.println ("cList URL: http://localhost:8080/weatherman/cList");
    }

    @Autowired
    private ICustomerService service;

    //Bi-directional mapping
    @GetMapping("register")
    public String homePage(Map<String, Object> model)
    {
        String ss="Form:";
        model.put ("getForm",ss);
        return "sign-up";
    }
    //Bi-directional mapping
    @PostMapping("register")
    public String showResult(Map<String, Object>model,@ModelAttribute("form") CustomerInfo CI)
    {
        service.registerCustomer (CI);
        model.put ("form", CI);
        return "result";
    }

    @GetMapping("cList")
    public String getClients(Model model)
    {
        Iterable<CustomerInfo> customerlist = service.getCustomers ();
        model.addAttribute ("customerlist",customerlist);
        return "customerlist";
    }
}
