package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*@Configuration - let IOC container to scan all contents of this class because
this is an indication to the spring framework that the developer has done some changes wihich will result into creating beans.
during startup/initialization of IOC , all contents will be scanned.
it indicates that the class has @Bean definition methods. So spring container can process the class and generate Spring Beans
to be used in the application.
*/

/* To tell Spring it neesa to search for classes annotated with stereotype annotations,
we use @ComponentScan annotation over the configuration class.
**/
@Configuration
@ComponentScan(basePackages = "com.example.beans")
public class ProjectConfig {

}
