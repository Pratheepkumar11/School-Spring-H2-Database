package com.example.SchoolSpring.service;


import com.example.SchoolSpring.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> allStudents();
    Student addStudent(Student student );
    Optional<Student> getStudentDetails(int id);
    Student updateStudentDetails(int id,Student student);
    String deleteStudentDetails(int id);

}
