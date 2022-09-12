package net.javaguides.class_student.service;

import net.javaguides.class_student.model.Point;
import net.javaguides.class_student.model.Student;

import java.util.List;

public interface PointService {
    List<Point> getPoint();

    String SavePoint(long student_id, Point point);
}
