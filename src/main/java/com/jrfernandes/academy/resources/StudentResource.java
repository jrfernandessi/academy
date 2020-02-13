package com.jrfernandes.academy.resources;

import com.jrfernandes.academy.model.Student;
import com.jrfernandes.academy.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "http://localhost:8081")
public class StudentResource {
    @Autowired
    private StudentService service;

    @PostMapping
    public ResponseEntity<Student> save(@RequestBody Student student){
        Student saveStudent = service.save(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(saveStudent);
    }
}
