package io.pragra.learning;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Student {

//    @Value("${student.name:'Vatsal'}")

    // property injection from application.properties
    @Value("${student.name}")
    private String name;

    //    @Value("${student.phone:'15642371465'}")
    @Value("${student.phone}")
    private String phone;
}
