package com.weatherman.MVC.JPA.service;

import com.weatherman.MVC.JPA.dao.WeathermanREPO;
import com.weatherman.MVC.JPA.model.CustomerInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CSImplementation implements ICustomerService
{
    @Autowired
    private WeathermanREPO repo;

    @Override
    public String registerCustomer(CustomerInfo CI)
    {
        System.out.println ("*ENTRY SAVED*");
        repo.save (CI);

        return "*Check Database*";
    }

    @Override
    public Iterable<CustomerInfo> registerMultiple(List<CustomerInfo> list)
    {
        return repo.saveAll (list);
    }

    @Override
    public String deleteAllCustomers(CustomerInfo CI)
    {
        repo.deleteAll ();

        return "*DATABASE RESET*";
    }

    @Override
    public Iterable<CustomerInfo> getCustomers()
    {
        return repo.findAll ();
    }
}
