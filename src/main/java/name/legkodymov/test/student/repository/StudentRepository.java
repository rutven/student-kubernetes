package name.legkodymov.test.student.repository;

import name.legkodymov.test.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
