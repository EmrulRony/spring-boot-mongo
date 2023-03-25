package com.example.springbootmongodb.service;

import com.example.springbootmongodb.model.Student;

public interface StudentService {
    Student saveStudent(Student student);

    Student findStudentByEmail(String email);

    void deleteStudent(String id);
}
