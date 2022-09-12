package net.javaguides.class_student.serviceImp;

import net.javaguides.class_student.model.Point;
import net.javaguides.class_student.model.Student;
import net.javaguides.class_student.repository.PointRepository;
import net.javaguides.class_student.repository.StudentRepository;
import net.javaguides.class_student.service.PointService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PointServiceImp implements PointService {
    @Autowired
    private PointRepository pointRepository;

    @Autowired
    public StudentRepository studentRepository;

    @Override
    public List<Point> getPoint() {
        return pointRepository.findAll();
    }

    @Override
    public String SavePoint(long student_id, Point point) {

        Student student = studentRepository.findById(student_id).get();

        if(student == null){
            return "student does not exist";
        }

        point.setStudent(student);

        pointRepository.save(point);
        return "Create point success";
    }
}
