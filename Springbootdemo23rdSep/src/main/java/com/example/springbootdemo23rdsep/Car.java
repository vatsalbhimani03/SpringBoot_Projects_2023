package com.example.springbootdemo23rdsep;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Car {

    @Value("${car.make:'Honda'}")
    private String make;

    @Value("${car.model:'Civic'}")
    private String model;
}
