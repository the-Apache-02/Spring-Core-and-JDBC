/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.lifecycle;

/**
 *
 * @author risha
 */
public class Jalebi {

    private double price;

    public Jalebi() {
        super();

    }

    public double getPrice() {
        System.out.println("getting");
        return price;
    }

    public String toString() {
        return "Price of Jalebi:" + this.price;
    }

    public void setPrice(double price) {

        this.price = price;
        System.out.println("setting");
    }

    public void init() {
        System.out.println("Initializing init method.");
    }

    public void destroy() {
        System.out.println("Destroying the code");
    }
}
