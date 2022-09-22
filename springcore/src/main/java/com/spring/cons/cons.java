/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.cons;

import java.util.List;

/**
 *
 * @author risha
 */
public class cons {

    private String name;
    private int personId;
    private Certi certificate;
    private List<String>list;
    public cons(String name, int personId,Certi certificate,List<String>list) {
        super();
        this.name = name;
        this.personId = personId;
        this.certificate = certificate;
        this.list = list;
    }

    public String toString() {
        return this.name + ":"+this.personId +"{"+ this.certificate+"} List="+this.list;
    }
}
