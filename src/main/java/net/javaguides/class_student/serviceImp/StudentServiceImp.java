package net.javaguides.class_student.serviceImp;

import net.javaguides.class_student.model.Student;
import net.javaguides.class_student.repository.StudentRepository;
import net.javaguides.class_student.service.StudentService;

import java.util.List;

public class StudentServiceImp implements StudentService {

    private StudentRepository studentRepository;
    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public String createStudent(Student student) {
        studentRepository.save(student);
        return "Create success";
    }

    @Override
    public String updateStudentById(long id, Student student) {
        Student data = studentRepository.findById(id).get();

        data.setFullName(data.getFullName());
        data.setAge(data.getAge());
        data.setSex(data.getSex());
        data.setCountry(data.getCountry());

        studentRepository.save(data);

        return "updated success";
    }

    @Override
    public String deleteStudentById(long id) {
        studentRepository.deleteById(id);
        return "delete success";
    }
}
