/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author risha
 */
public class lifeCycleMain {
    public static void main(String[] args) {
           AbstractApplicationContext context=new ClassPathXmlApplicationContext("springConfig.xml");
//            Jalebi ja=(Jalebi)context.getBean("jalebi");
//        System.out.println(ja);
        context.registerShutdownHook();
//Pepsi s=(Pepsi)context.getBean("pepsi");
    //    System.out.println(s);
Example e=(Example)context.getBean("example");
        System.out.println(e);
    }
 

}
