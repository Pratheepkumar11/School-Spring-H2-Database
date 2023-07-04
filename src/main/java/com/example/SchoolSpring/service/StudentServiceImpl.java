package com.example.SchoolSpring.service;


import com.example.SchoolSpring.model.Student;
import com.example.SchoolSpring.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepo studentRepo;


    @Override
    public List<Student> allStudents() {
        return this.studentRepo.findAll();
    }

    @Override
    public Student addStudent(Student student) {

        return this.studentRepo.save(student);
    }

    @Override
    public Optional<Student> getStudentDetails(int id) {

        return this.studentRepo.findById(id);
    }

    @Override
    public Student updateStudentDetails(int id,Student student) {
        Optional<Student> studentOptional = studentRepo.findById(id);
        if(studentOptional.isPresent()){
            Student studentFromDb = studentOptional.get();
            studentFromDb.setName(student.getName());
            studentFromDb.setDob(student.getDob());
            studentRepo.save(studentFromDb);
            return studentFromDb;
        }
        return null;
    }

    @Override
    public String deleteStudentDetails(int id) {
        this.studentRepo.deleteById(id);
        return "deleted successfully";
    }
}
