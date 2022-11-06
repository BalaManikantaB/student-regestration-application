package com.practice.studentmanagementapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.practice.studentmanagementapplication.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Query("select count(s)>0 from Student s where s.name = ?1")
    boolean findIfExists(String name);
}
