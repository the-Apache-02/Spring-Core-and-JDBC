/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author risha
 */
public class TestRef {
    public static void main(String[] args) {
      ApplicationContext context=  new ClassPathXmlApplicationContext("springConfig.xml");
      A temp=(A)context.getBean("aref");
        System.out.println(temp.getA());
        System.out.println(temp.getOb().getY());
        System.out.println(temp.getOb());
    }
}
