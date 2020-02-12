package com.jrfernandes.academy.services;

import com.jrfernandes.academy.model.Student;
import com.jrfernandes.academy.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository repository;

    public Student save(Student student){
        return repository.save(student);
    }
}
