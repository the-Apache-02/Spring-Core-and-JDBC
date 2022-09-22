/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.collection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author risha
 */
public class empMain {
    public static void main(String[] args) {
     ApplicationContext context=new ClassPathXmlApplicationContext("springConfig.xml");
 
       Emp e=(Emp)context.getBean("emp1");
        System.out.println(e.getName());
        System.out.println(e.getPhones());
        System.out.println(e.getAddresses());
        System.out.println(e.getCourses());
        System.out.println(e.getPhones().getClass().getName());
    }
}
