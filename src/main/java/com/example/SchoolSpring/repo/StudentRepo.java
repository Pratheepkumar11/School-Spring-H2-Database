package com.example.SchoolSpring.repo;


import com.example.SchoolSpring.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
