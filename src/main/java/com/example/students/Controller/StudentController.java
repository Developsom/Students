package com.example.students.Controller;


import com.example.students.Entity.Student;
import com.example.students.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("students") //This is the endpoint
public class StudentController {

    @Autowired
    StudentRepository repos; //Repos can now be called to use object

    @GetMapping
    public ResponseEntity<Iterable<Student>> getStudents() {
        return ResponseEntity.ok(repos.findAll());
    }




}
