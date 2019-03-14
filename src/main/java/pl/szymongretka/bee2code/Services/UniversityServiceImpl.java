package pl.szymongretka.bee2code.Services;

import org.springframework.stereotype.Service;
import pl.szymongretka.bee2code.Repositories.StudentRepository;
import pl.szymongretka.bee2code.Repositories.UniversityRepository;
import pl.szymongretka.bee2code.domain.Student;
import pl.szymongretka.bee2code.domain.University;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UniversityServiceImpl implements UniversityService {

    private final UniversityRepository universityRepository;
    private final StudentRepository studentRepository;

    public UniversityServiceImpl(UniversityRepository universityRepository, StudentRepository studentRepository) {
        this.universityRepository = universityRepository;
        this.studentRepository = studentRepository;
    }

    @Override
    public List<University> findAllUniversities() {
        return universityRepository.findAll();
    }

    @Override
    public List<Student> getListOFStudents(){
        return studentRepository.findAll();
    }

    @Override
    public University findByName(String name) {
        return universityRepository.findByName(name);
    }

    @Override
    public University save(University university) {
        return universityRepository.save(university);
    }

    @Override
    public Optional<University> findById(Long id) {
        return universityRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        universityRepository.deleteById(id);
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Set<Student> findStudentsFromUniversity(String name) {
        University university = universityRepository.findByName(name);
        Set<Student> students = university.getStudentsList();
        return students;
    }


}
