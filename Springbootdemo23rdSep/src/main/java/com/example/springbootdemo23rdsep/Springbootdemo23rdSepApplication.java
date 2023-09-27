package com.example.springbootdemo23rdsep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication = @ComponentScan + @EnableAutoConfiguration
@SpringBootApplication
public class Springbootdemo23rdSepApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(Springbootdemo23rdSepApplication.class, args);
        System.out.println("Car = "+ context.getBean(Car.class));



    }

}
