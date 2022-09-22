/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.autowiring.annotation;

import com.spring.autowiring.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author risha
 */
public class AutoWireTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
        Emp e = context.getBean("emp", Emp.class);
        Emp em = (Emp) context.getBean("emp");
        System.out.println(e);
        System.out.println("++++++++++++++++++++++++++");
        System.out.println(em);
        if (em.equals(e)) {
            System.out.println("Equal");
        } else {
            System.out.println("not equal");
        }
    }
}
