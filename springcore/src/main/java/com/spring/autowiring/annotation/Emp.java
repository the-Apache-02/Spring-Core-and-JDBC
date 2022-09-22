/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.autowiring.annotation;

import com.spring.autowiring.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 *
 * @author risha
 */
public class Emp {
//above the property
@Autowired
    @Qualifier("address12")
    private Address address;

    public Address getAddress() {
        return address;
    }
//above setter method
//@Autowired
    public void setAddress(Address address) {
        System.out.println("setting ");
        this.address = address;
    }
//@Autowired
    public Emp(Address address) {
        super();
        System.out.println("inside the constructor");
        this.address = address;
    }

    public Emp() {
        super();
    }

    public String toString() {
        return "Address:" + this.address;
    }
}
