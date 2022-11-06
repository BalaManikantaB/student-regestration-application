package com.practice.studentmanagementapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.practice.studentmanagementapplication.model.Student;
import com.practice.studentmanagementapplication.service.StudentService;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {
    @Autowired
    StudentService studentService;

    @Override
    public void run(String... args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Student.xml");
        Student student = applicationContext.getBean("otherStudent", Student.class);
        if (studentService.saveStudent(student) == null)
            System.out.println("Already exists");
        else
            System.out.println("Successfuly added");

        ((ConfigurableApplicationContext) applicationContext).close();
    }
}
