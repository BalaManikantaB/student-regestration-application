package com.practice.studentmanagementapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.studentmanagementapplication.model.Student;
import com.practice.studentmanagementapplication.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student) {
        Student s = studentService.saveStudent(student);
        if (s == null)
            return "Already exists";
        return "Student saved";
    }

    @GetMapping("/")
    public List<Student> get() {
        return studentService.getStudents();
    }
}
