package com.example.jparelationships.repo;

import com.example.jparelationships.entity.StudentPermit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentPermitRepo extends JpaRepository<StudentPermit, Integer> {
}
