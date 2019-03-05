package pl.szymongretka.bee2code.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.szymongretka.bee2code.domain.FieldOfStudy;

public interface FieldOfStudyRepository extends JpaRepository<FieldOfStudy, Long> {
}
