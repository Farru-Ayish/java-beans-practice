package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//main method class - start initialization process of IOC container
public class Example1 {
    public static void main(String[] args) {

        // with new keyword - create object, and use setters - this is not going to be tracked in spring IOC.
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda City");
        System.out.println("Vehicle name from non-spring context is: " + vehicle.getName());

        // create object - with class constructor define our configs inside params,
        /* use App Text IOC container - interfaces - create object of impl classes of those interfaces
        we do all config with help of @Bean, @Configs, hence AnnotationConfigApp
        the object of this class will be in context which initializes IOC, hence says,
        during startup consider all the configs mentioned.
        **/
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh = context.getBean(Vehicle.class);//Gives spring bean maintained by IOC with this datatype.
        System.out.println("Vehicle name from spring context is: "+veh.getName());

        /* We do not need to do any explicit casting while fetching a bean from context, Spring itself will
        look for requested datatype, if no exists - exception thrown.
        **/
        String stringVehicle = context.getBean(String.class);
        System.out.println("String from spring context is: "+stringVehicle);

        Integer integerVehicle = context.getBean(Integer.class);
        System.out.println("Integer from spring context is: "+integerVehicle);

    }
}
