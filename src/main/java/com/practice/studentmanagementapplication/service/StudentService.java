package com.practice.studentmanagementapplication.service;

import java.util.List;

import com.practice.studentmanagementapplication.model.Student;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getStudents();
}
