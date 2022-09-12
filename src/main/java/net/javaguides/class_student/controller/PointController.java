package net.javaguides.class_student.controller;

import net.javaguides.class_student.model.Point;
import net.javaguides.class_student.model.Student;
import net.javaguides.class_student.serviceImp.PointServiceImp;
import net.javaguides.class_student.serviceImp.StudentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/point")
public class PointController {
    @Autowired
    private PointServiceImp pointServiceImp;

    @GetMapping(value = "/")
    public String getPage(){
        return ("Welcome to API point");
    }

    @GetMapping(value = "/getAllPoint")
    public ResponseEntity<List<Point>> getAllPoint(){
        return pointServiceImp.getAllPoint();
    }

    @PutMapping(value = "/savePoint/{student_id}")
    public ResponseEntity<Point> savePoint(@PathVariable long student_id, @RequestBody Point point){
        return pointServiceImp.savePoint(student_id, point);
    }
}
