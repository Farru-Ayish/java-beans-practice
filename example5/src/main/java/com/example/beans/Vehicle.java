package com.example.beans;

import org.springframework.stereotype.Component;

/* @Component - indicates that this class should be converted into beans, var, getter, setter, print method()
**/
@Component
public class Vehicle {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println("Hello");
    }
}
