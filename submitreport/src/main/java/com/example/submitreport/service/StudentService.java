package com.example.submitreport.service;

import com.example.submitreport.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}



