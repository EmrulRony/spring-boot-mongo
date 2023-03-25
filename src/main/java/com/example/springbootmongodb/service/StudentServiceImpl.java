package com.example.springbootmongodb.service;

import com.example.springbootmongodb.model.Student;
import com.example.springbootmongodb.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Transactional
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findStudentByEmail(String email) {
        return studentRepository.findStudentByEmail(email)
                .orElseThrow(() -> new RuntimeException("Student not found with email: " + email));
    }

    @Transactional
    @Override
    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }
}
