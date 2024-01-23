package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//main method class - start initialization process of IOC container
public class Example5 {
    public static void main(String[] args) {
        //When same return datatype defined for multiple beans, IOC will confuse to return the exact bean expected.
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh1 = context.getBean(Vehicle.class);//Gives spring bean maintained by IOC with this datatype.
        //veh1 bean, getName - because as developer we don't have control while creating an object
        //it is the spring IOC container which creates during runtime.- so it prints null value.
        System.out.println("Primary Vehicle name from spring context is: "+veh1.getName());
        veh1.printHello();
    }

}
