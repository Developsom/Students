package com.example.students.Controller;


import com.example.students.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("students") //This is the endpoint
public class StudentController {

    @Autowired
    StudentRepository repos; //Repos can now be called to use object

}
