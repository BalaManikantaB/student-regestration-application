package com.practice.studentmanagementapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.studentmanagementapplication.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
