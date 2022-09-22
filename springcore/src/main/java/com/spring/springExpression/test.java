/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.springExpression;

import java.beans.Expression;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 *
 * @author risha
 */
public class test {
    public static void main(String[] args) throws Exception {
        ApplicationContext app=new ClassPathXmlApplicationContext("springConfig.xml");
Demo d=(Demo) app.getBean("demo");
        System.out.println(d);
//        SpelExpressionParser temp=new SpelExpressionParser();
//        Expression exp= temp.parseExpression("{45+55}");
//        System.out.println(exp.getValue());
    }
}
