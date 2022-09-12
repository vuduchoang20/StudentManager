package net.javaguides.class_student.service;

import net.javaguides.class_student.model.Point;
import net.javaguides.class_student.model.Student;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PointService {
    ResponseEntity<List<Point>> getAllPoint();

    ResponseEntity<Point> savePoint(long student_id, Point point);
}
