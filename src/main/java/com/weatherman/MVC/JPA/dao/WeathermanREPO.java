package com.weatherman.MVC.JPA.dao;

import com.weatherman.MVC.JPA.model.CustomerInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeathermanREPO extends CrudRepository<CustomerInfo,Integer>
{
}
