package com.example.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping("/status")
    public String status(){
        return "Active...";
    }

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return service.getAllStudents();
    }

    @PutMapping("/student")
    public Student addStudent(@RequestBody Student student){
        try {
            System.out.println(student.toString());
            return service.addStudent(student);
        }
        catch (Exception e) {
            return null;
        }
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable int id){
        service.deleteStudent(id);
    }
}

