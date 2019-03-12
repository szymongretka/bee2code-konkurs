package pl.szymongretka.bee2code.Services;

import org.springframework.stereotype.Service;
import pl.szymongretka.bee2code.Repositories.StudentRepository;
import pl.szymongretka.bee2code.Repositories.UniversityRepository;
import pl.szymongretka.bee2code.domain.Student;
import pl.szymongretka.bee2code.domain.University;

import java.util.List;

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


}
