package net.javaguides.class_student.serviceImp;

import net.javaguides.class_student.model.Student;
import net.javaguides.class_student.repository.StudentRepository;
import net.javaguides.class_student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public ResponseEntity<List<Student>> getAllStudent() {
        List<Student> studentList = studentRepository.findAll();
        if(studentList.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity(studentList, HttpStatus.OK);
    }

    @Override
    public Student createStudent(Student input) {
        return studentRepository.save(input);
    }

    @Override
    public ResponseEntity<Student> updateStudentById(long id, Student input) {
        Student student = studentRepository.findById(id).get();

        if(student == null) {
            return ResponseEntity.notFound().build();
        }

        student.setFullName(input.getFullName());
        student.setAge(input.getAge());
        student.setSex(input.getSex());
        student.setCountry(input.getCountry());

        Student updatedStudent = studentRepository.save(student);

        return ResponseEntity.ok(updatedStudent);
    }

    @Override
    public ResponseEntity<Student> deleteStudentById(long id) {
        Student student = studentRepository.findById(id).get();

        if(student == null) {
            return ResponseEntity.notFound().build();
        }

        studentRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
