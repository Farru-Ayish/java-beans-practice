package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*@Configuration - let IOC container to scan all contents of this class because
this is an indication to the spring framework that the developer has done some changes wihich will result into creating beans.
during startup/initialization of IOC , all contents will be scanned.
it indictes that the class has @Bean definition methods. So spring container can process the class and generate Spring Beans
to be used in the application.
*/
@Configuration
public class ProjectConfig {


    //convert vehicle object into spring bean.
    /* @Bean lets spring know that it needs to call this method when it initializes its
    context and adds the returned value to the context.
    **/
    @Bean
    Vehicle vehicle1(){
        // var keyword - Java 10 - type inference - reduce burden of dev
        // before Java 10, on the left side - dev need to mention the class name,
        // after var keyword, it infers the class tyoe on right hand side.
        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }

    @Bean
    Vehicle vehicle2(){
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    @Bean
    Vehicle vehicle3(){
        var veh = new Vehicle();
        veh.setName("Ferrari");
        return veh;
    }

}
