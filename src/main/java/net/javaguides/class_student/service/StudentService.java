package net.javaguides.class_student.service;

import net.javaguides.class_student.model.Student;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StudentService {

    ResponseEntity<List<Student>> getAllStudent();

    Student createStudent(Student student);

    ResponseEntity<Student> updateStudentById(long id,Student student);

    ResponseEntity<Student> deleteStudentById(long id);
}
