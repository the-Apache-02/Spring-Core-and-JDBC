/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 *
 * @author risha
 */
public class Pepsi implements InitializingBean,DisposableBean{
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("setting");
        this.price = price;
    }

    public Pepsi() {
super();
    }
public String toString(){
return "Price of Pepsi: "+this.price;
}

    /**
     *
     */
    public void afterPropertiesSet(){
    System.out.println("from initializing");
}

    /**
     *
     */
    public void destroy(){
    System.out.println("From destroy method");
}
}
