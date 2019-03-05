package pl.szymongretka.bee2code.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.szymongretka.bee2code.domain.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
