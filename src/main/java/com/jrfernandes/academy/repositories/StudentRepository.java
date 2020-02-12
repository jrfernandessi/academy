package com.jrfernandes.academy.repositories;

import com.jrfernandes.academy.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
