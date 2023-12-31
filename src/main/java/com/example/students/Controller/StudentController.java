package com.example.students.Controller;


import com.example.students.Model.Student;
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



    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        repos.save(student);

        URI uri = URI.create(ServletUriComponentsBuilder
                .fromCurrentRequest().path("/" + student.getId()).toUriString());

        return ResponseEntity.created(uri).body(student);
    }

}
