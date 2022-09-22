/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.cons;

/**
 *
 * @author risha
 */
public class Adition {

    private int a;
    private int b;
public Adition(double a, double b) {
        this.a = (int) a;
        this.b = (int) b;
        System.out.println("Constructor from double");
    }
public Adition(String a, String b) {
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        System.out.println("Constructor from String");
    }
    public Adition(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Constructor from int");
    }

    

    public void doSum() {
        System.out.println("Value of a:" + this.a);
        System.out.println("Value of b:" + this.b);
        System.out.println("Sum of a and b:" + (this.a + this.b));
    }
}
