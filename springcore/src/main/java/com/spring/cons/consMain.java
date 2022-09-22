package com.spring.cons;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author risha
 */
public class consMain {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("springConfig.xml");
        cons c=(cons)context.getBean("cons");
        System.out.println(c);
        Adition ad=(Adition)context.getBean("add");
        ad.doSum();
    }
}
