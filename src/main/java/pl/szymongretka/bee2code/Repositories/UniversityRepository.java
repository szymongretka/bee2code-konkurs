package pl.szymongretka.bee2code.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.szymongretka.bee2code.domain.University;

public interface UniversityRepository extends JpaRepository<University, Long> {
}
