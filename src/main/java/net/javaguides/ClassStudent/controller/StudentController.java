package net.javaguides.ClassStudent.controller;

import net.javaguides.ClassStudent.model.Student;
import net.javaguides.ClassStudent.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping(value = "/getAllStudent")
    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

    @GetMapping(value = "/")
    public String getPage(){
        return ("Welcome");
    }
}
