package pl.szymongretka.bee2code.Services;

import pl.szymongretka.bee2code.domain.Student;
import pl.szymongretka.bee2code.domain.University;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface UniversityService {
    List<University> findAllUniversities();
    List<Student> getListOFStudents();
    University findByName(String name);
    University save(University university);
    Optional<University> findById(Long id);
    void deleteById(Long id);
    Student saveStudent(Student student);
    Set<Student> findStudentsFromUniversity(String name);
}
