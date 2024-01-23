package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//main method class - start initialization process of IOC container
// Example for defining names for bean
public class Example4 {
    public static void main(String[] args) {
        //When same return datatype defined for multiple beans, IOC will confuse to return the exact bean expected.
        //So need to pass two params to get the required bean.
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh1 = context.getBean(Vehicle.class);//Gives spring bean maintained by IOC with this datatype.
        System.out.println("Primary Vehicle name from spring context is: "+veh1.getName());

    }

}
