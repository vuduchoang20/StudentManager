package net.javaguides.ClassStudent.repository;

import net.javaguides.ClassStudent.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // crud
}
