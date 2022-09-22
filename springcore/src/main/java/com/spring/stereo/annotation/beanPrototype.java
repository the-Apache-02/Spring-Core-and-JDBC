/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.stereo.annotation;

/**
 *
 * @author risha
 */
public class beanPrototype {
    private String beanScope;

    public String getBeanScope() {
        return beanScope;
    }

    public void setBeanScope(String beanScope) {
        this.beanScope = beanScope;
    }
public String toString(){
return "Bean Scope="+this.beanScope;
}
}
