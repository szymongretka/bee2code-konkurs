package pl.szymongretka.bee2code.Services;

import org.springframework.stereotype.Service;
import pl.szymongretka.bee2code.domain.Student;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> findAllStudents() {
        return null;
    }
}
