package vn.edu.vn.fit.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.vn.fit.models.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}