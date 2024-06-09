package com.weatherman.MVC.JPA.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@Table(name = "CustomerInfo")
public class CustomerInfo
{
    public CustomerInfo()
    {
        System.out.println ("*CustomerInfo Bean activated*");
    }

//    public CustomerInfo(Integer ID,String name,String surname,String city)
//    {
//      this.ID=ID;
//      this.name=name;
//      this.surname=surname;
//      this.city=city;
//    }

    @Id
    @Column(name = "ID")
    private Integer ID;

    @Column(name = "Name")
    private String name;

    @Column(name = "Surname")
    private String surname;

    @Column(name = "City")
    private String city;
}

