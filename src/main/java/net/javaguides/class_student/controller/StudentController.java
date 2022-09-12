package net.javaguides.class_student.controller;

import net.javaguides.class_student.model.Student;
import net.javaguides.class_student.repository.StudentRepository;
import net.javaguides.class_student.serviceImp.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired(required = true)
    private StudentServiceImp studentServiceImp;

    @GetMapping(value = "/")
    public String getPage(){
        return ("Welcome to API CRUD student");
    }

    @GetMapping(value = "/getAllStudent")
    public List<Student> getAllStudent(){
        return studentServiceImp.getAllStudent();
    }

    @PostMapping(value = "/createStudent")
    public String createStudent(Student student) {
        return studentServiceImp.createStudent(student);
    }

    @PutMapping(value = "/updateStudentById/{id}")
    public String updateStudentById(long id, Student student){
        return studentServiceImp.updateStudentById(id, student);
    }

    @DeleteMapping(value = "/deleteStudentById/{id}")
    public String deleteStudentById(long id){
        return studentServiceImp.deleteStudentById(id);
    }
}
