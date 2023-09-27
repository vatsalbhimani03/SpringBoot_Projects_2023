package com.example.jparelationships.repo;

import com.example.jparelationships.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// we can use @Component instead @Repository but it's best to use @Repository
@Repository // it only has database related stuff
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
