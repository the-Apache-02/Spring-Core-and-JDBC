/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.core.RemoveXml;

import org.springframework.stereotype.Component;

/**
 *
 * @author risha
 */
//@Component
public class Student {

    private India state;

    public Student(India state) {
        super();
        this.state = state;
    }

    public India getState() {
        return state;
    }

    public void setState(India state) {
        this.state = state;
    }

    public void display() {
        this.state.displayState();
        System.out.println("We are learning java framework");
    }
}
