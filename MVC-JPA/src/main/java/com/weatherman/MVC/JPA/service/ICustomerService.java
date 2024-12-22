package com.weatherman.MVC.JPA.service;

import com.weatherman.MVC.JPA.model.CustomerInfo;

import java.util.List;

public interface ICustomerService
{
    String registerCustomer(CustomerInfo CI);
    Iterable<CustomerInfo> registerMultiple(List<CustomerInfo>list);
    String  deleteAllCustomers(CustomerInfo CI);
    Iterable<CustomerInfo> getCustomers();
}
