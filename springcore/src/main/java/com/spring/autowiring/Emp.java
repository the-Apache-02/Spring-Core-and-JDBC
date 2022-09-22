/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.autowiring;



/**
 *
 * @author risha
 */
public class Emp {

    private Address address;
    
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("setting ");
        this.address = address;
    }

    public Emp(Address address) {
    super();
        System.out.println("inside the constructor");
        this.address = address;
    }

    public Emp() {
        super();
    }

public String toString(){
return "Address:"+this.address;
}
}
