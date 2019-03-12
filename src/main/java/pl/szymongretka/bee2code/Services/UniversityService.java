package pl.szymongretka.bee2code.Services;

import pl.szymongretka.bee2code.domain.Student;
import pl.szymongretka.bee2code.domain.University;

import java.util.List;

public interface UniversityService {
    List<University> findAllUniversities();
    List<Student> getListOFStudents();
    University findByName(String name);
}
