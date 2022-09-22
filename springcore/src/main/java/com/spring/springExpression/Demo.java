/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.springExpression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author risha
 */
@Component()
public class Demo {

    @Value("#{34+66}")
    private int x;
    @Value("#{8>6?1:0}")
    private int y;
    @Value("#{T(java.lang.Math).sqrt(144)}")
    private double z;

@Value("#{T(java.lang.Math).PI}")
private double pi;

@Value("#{new java.lang.String('Rishabh Khandagre')}")
private String string;

//boolean value
@Value("#{8>3}")
private boolean isActive;
    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }
    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "values are : X=" + this.x + "\nY=" + this.y+" ,Z="+this.z+", pi= "+this.pi+", string="+this.string+",\nisActive="+this.isActive;

    }
}
