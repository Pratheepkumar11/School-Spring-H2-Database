package com.example.SchoolSpring.controller;

import com.example.SchoolSpring.model.Student;
import com.example.SchoolSpring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    StudentService studentService;

    //http://localhost:8090/api/v1/Students
    @GetMapping("/Students")
    public List<Student> getStudents(){
        return studentService.allStudents();
    }

    //http://localhost:8090/api/v1/Students
    @PostMapping("/Students")
    public Student addVehicle(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    //http://localhost:8090/api/v1/Students/1
    @PutMapping("Students/{id}")
    public Student updateEmployeeById(@PathVariable int id,@RequestBody Student student){
        return studentService.updateStudentDetails(id,student);
    }

    //http://localhost:8090/api/v1/Students/1
    @GetMapping("/Students/{id}")
    public Optional<Student> getEmployeeById(@PathVariable int id){
        return studentService.getStudentDetails(id);
    }

    //http://localhost:8090/api/v1/Students/1
    @DeleteMapping("/Students/{id}")
    public String deleteById(@PathVariable int id) {
        return  studentService.deleteStudentDetails(id);
    }




}
