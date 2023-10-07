package com.example.jparelationships.service;

import com.example.jparelationships.entity.Student;
import com.example.jparelationships.entity.StudentPermit;
import com.example.jparelationships.repo.ReviewRepo;
import com.example.jparelationships.repo.StudentPermitRepo;
import com.example.jparelationships.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service  // developer knows that we are only talking about BUSINESS LOGICS
public class StudentService {
//    1st Way - Setter based Dependency Injection - if we use method then only it will be injected
    @Autowired
    StudentRepo repo;

    @Autowired
    StudentPermitRepo studentPermitRepo;

    @Autowired
    ReviewRepo reviewRepo;

//    2nd Way - Constructor based Dependency Injection
//    StudentRepo repo;
//
//    public StudentService(StudentRepo repo) {
//        this.repo = repo;
//    }

    public Student addStudent(Student s){

//        if(s.getFunnyName().length() > 3){
//            reviewRepo.saveAll(s.getReviews()); // id: 1
//            studentPermitRepo.save(s.getStudentPermit());  // id:2
//            return repo.save(s);  // id:3
//        }

        reviewRepo.saveAll(s.getReviews());

        // ID will be in sequence for both table (first studentPermit Table & then Student table
        studentPermitRepo.save(s.getStudentPermit());  // id:1
        return repo.save(s);  // id:2
    }

    public Student getStudentById(Integer id){

        return repo.findById(id).orElseGet(() -> new Student());
    }

}
