/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author risha
 */
public class testMain {
    public static void main(String[] args) {
        ApplicationContext app=new ClassPathXmlApplicationContext("springConfig.xml");
       Person p=app.getBean("Cloth",Person.class);
        System.out.println(p);
        System.out.println(p.getLothing().getClass().getName());
        System.out.println("=========================================");
        System.out.println(p.getPrice());
        System.out.println("+++++++++++++++");
        System.out.println(p.getProp());
    }
}
