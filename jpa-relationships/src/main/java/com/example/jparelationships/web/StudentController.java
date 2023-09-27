package com.example.jparelationships.web;

import com.example.jparelationships.entity.Student;
import com.example.jparelationships.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService service;

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student){
        return service.addStudent(student);
    }

    @GetMapping("/get/{id}")
    public Student getStudentById(@PathVariable Integer id){
        return service.getStudentById(id);
    }
}
