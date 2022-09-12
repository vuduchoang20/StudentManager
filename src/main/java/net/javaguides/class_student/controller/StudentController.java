package net.javaguides.class_student.controller;

import net.javaguides.class_student.model.Student;
import net.javaguides.class_student.serviceImp.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentServiceImp studentServiceImp;

    @GetMapping(value = "/")
    public String getPage(){
        return ("Welcome to API CRUD student");
    }

    @GetMapping(value = "/getAllStudent")
    public ResponseEntity<List<Student>> getAllStudent(){
        return studentServiceImp.getAllStudent();
    }

    @PostMapping(value = "/createStudent")
    public Student createStudent(@RequestBody Student student) {
        return studentServiceImp.createStudent(student);
    }

    @PutMapping(value = "/updateStudentById/{id}")
    public ResponseEntity<Student> updateStudentById(@PathVariable long id,@RequestBody Student student){
        return studentServiceImp.updateStudentById(id, student);
    }

    @DeleteMapping(value = "/deleteStudentById/{id}")
    public ResponseEntity<Student> deleteStudentById(@PathVariable long id){
        return studentServiceImp.deleteStudentById(id);
    }
}
