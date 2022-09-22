/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring;
import com.spring.collection.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  
/**
 *
 * @author risha
 */
public class App {
 static String mean(){
     System.out.println("MANU");
return "hari";
}
    public static void main(String[] args) {
        System.out.println("Hello world");
        ApplicationContext pp=new ClassPathXmlApplicationContext("sprindfg-config.xml");
       Student s1=(Student)pp.getBean("student1");
      System.out.println(s1);
        Student s2=(Student)pp.getBean("student2");

        System.out.println(s2);
//Emp e=(Emp)pp.getBean("emp1");
//        System.out.println(e.getName());
//        System.out.println(e.getPhones());
//        System.out.println(e.getAddresses());
//        System.out.println(e.getCourses());
        System.out.println(App.mean());
    }
}
