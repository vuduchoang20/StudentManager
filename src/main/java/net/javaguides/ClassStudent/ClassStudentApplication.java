package net.javaguides.ClassStudent;

import net.javaguides.ClassStudent.model.Student;
import net.javaguides.ClassStudent.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClassStudentApplication implements CommandLineRunner {

	public static void main(String[] args) { SpringApplication.run(ClassStudentApplication.class, args); }

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		/*Student student = new Student();
		student.setAge(23);
		student.setSex(true);
		student.setCountry("Thai Binh");
		student.setFullName("Vu Duc Hoang");
		studentRepository.save(student);*/
	}
}
