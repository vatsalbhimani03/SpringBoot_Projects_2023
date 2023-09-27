package com.example.springjava23;

import com.example.springjava23.Excercise.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJava23Application {

    public static void main(String[] args) {

        // creating bean using Java - simply create object
        Employee emp = new Employee();


        // creating bean using IOC - Declare @Component in Employee class
        ApplicationContext applicationContext = SpringApplication.run(SpringJava23Application.class, args);
        Employee bean = applicationContext.getBean(Employee.class);



    }

}
