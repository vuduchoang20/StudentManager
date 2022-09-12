package net.javaguides.class_student.repository;

import net.javaguides.class_student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // crud
}
