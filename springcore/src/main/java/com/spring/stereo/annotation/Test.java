/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.stereo.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author risha
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
        Student student = context.getBean("b", Student.class);
        System.out.println(student.hashCode());
//        System.out.println(student.getAddress());
//        System.out.println(student.getClass().getName());
Student studenty2=context.getBean("b",Student.class);
        System.out.println(studenty2.hashCode());

beanPrototype p=context.getBean("proto",beanPrototype.class);
        System.out.println(p);
        System.out.println(p.hashCode());
beanPrototype p1=(beanPrototype)context.getBean("proto");
        System.out.println(p1.hashCode());

    }
}
