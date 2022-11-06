package com.practice.studentmanagementapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.studentmanagementapplication.model.Student;
import com.practice.studentmanagementapplication.repository.StudentRepository;

@Service
public class StudentServiceImplementation implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        if (!studentRepository.findIfExists(student.getName())) {
            studentRepository.save(student);
            return student;
        }
        return null;
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
}
