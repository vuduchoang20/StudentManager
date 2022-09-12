package net.javaguides.class_student.serviceImp;

import net.javaguides.class_student.model.Point;
import net.javaguides.class_student.model.Student;
import net.javaguides.class_student.repository.PointRepository;
import net.javaguides.class_student.repository.StudentRepository;
import net.javaguides.class_student.service.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PointServiceImp implements PointService {
    @Autowired
    private PointRepository pointRepository;

    @Autowired
    public StudentRepository studentRepository;

    @Override
    public ResponseEntity<List<Point>> getAllPoint() {

        List<Point> listPoint = pointRepository.findAll();
        if(listPoint.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<Point>>(listPoint, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Point> SavePoint(long student_id, Point point) {

        Student student = studentRepository.findById(student_id).get();

        if(student == null){
            return ResponseEntity.notFound().build();
        }

        point.setStudent(student);

        Point a = pointRepository.save(point);

        return ResponseEntity.ok(a);
    }
}
