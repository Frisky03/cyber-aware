package com.example.submitreport.controller;

import com.example.submitreport.model.Student;
import com.example.submitreport.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "Report Submitted";
    }
    @GetMapping("/getAll")
    public List<Student> list(){
        return studentService.getAllStudents();
    }
}
