package com.example.studentmanagementsystem.repos;

import com.example.studentmanagementsystem.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
