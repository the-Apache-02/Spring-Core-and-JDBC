/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 *
 * @author risha
 */
public class Example {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Example() {
super();
    }

public String toString(){
return "Subject : "+this.subject;
}
@PostConstruct
public void start(){
    System.out.println("Starting method");
}
@PreDestroy
public void ending(){
    System.out.println("Ending method");
}
}
