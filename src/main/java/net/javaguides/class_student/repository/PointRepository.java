package net.javaguides.class_student.repository;

import net.javaguides.class_student.model.Point;
import net.javaguides.class_student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointRepository extends JpaRepository<Point, Long> {
}
