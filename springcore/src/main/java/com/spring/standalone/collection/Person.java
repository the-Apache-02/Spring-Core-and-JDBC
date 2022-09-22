/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.spring.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 *
 * @author risha
 */
public class Person {
    private List<String>lothing;
    private Map<String,Integer>price;
private Properties prop;

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    public Map<String, Integer> getPrice() {
        return price;
    }

    public void setPrice(Map<String, Integer> price) {
        this.price = price;
    }

    public List<String> getLothing() {
        return lothing;
    }

    public void setLothing(List<String> lothing) {
        this.lothing = lothing;
    }

   
    

public String toString(){
return "Clothing brands: "+this.lothing+" Price: "+this.price;
}

}
