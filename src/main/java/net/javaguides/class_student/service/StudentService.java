package net.javaguides.class_student.service;

import net.javaguides.class_student.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudent();

    String createStudent(Student student);

    String updateStudentById(long id,Student student);

    String deleteStudentById(long id);
}
