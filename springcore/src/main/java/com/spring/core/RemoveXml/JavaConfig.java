/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.core.RemoveXml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author risha
 */
@Configuration()
//@ComponentScan(basePackages = "com.spring.core.RemoveXml")
public class JavaConfig {

    @Bean
    public India getIndia() {
        return new India();
    }

    @Bean(name={"tudent","temp"})
    public Student getStudent() {
//creating the object of Student class
        Student student = new Student(getIndia());
        return student;
    }

}
