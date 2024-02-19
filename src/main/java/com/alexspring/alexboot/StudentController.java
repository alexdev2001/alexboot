package com.alexspring.alexboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

    private final Studentservice Studentservice;

    @Autowired
    public StudentController(Studentservice Studentservice) {
        this.Studentservice = Studentservice;
    }

    @GetMapping
    public List<student> getStudents() {
        return Studentservice.getStudents();


    }
    
}
