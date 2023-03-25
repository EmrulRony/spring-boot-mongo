package com.example.springbootmongodb.controller;

import com.example.springbootmongodb.model.Student;
import com.example.springbootmongodb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/get/{email}")
    public Student getStudent(@PathVariable String email) {
        return studentService.findStudentByEmail(email);
    }

    @GetMapping("/delete/{id}")
    public void deleteStudent(@PathVariable String id) {
        studentService.deleteStudent(id);
    }
}
