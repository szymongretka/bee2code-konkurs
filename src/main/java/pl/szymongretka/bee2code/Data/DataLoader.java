package pl.szymongretka.bee2code.Data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import pl.szymongretka.bee2code.Repositories.FieldOfStudyRepository;
import pl.szymongretka.bee2code.Repositories.StudentRepository;
import pl.szymongretka.bee2code.Repositories.UniversityRepository;

@Configuration
public class DataLoader implements CommandLineRunner {

    private final StudentRepository studentRepository;
    private final UniversityRepository universityRepository;
    private final FieldOfStudyRepository fieldOfStudyRepository;

    public DataLoader(StudentRepository studentRepository, UniversityRepository universityRepository, FieldOfStudyRepository fieldOfStudyRepository) {
        this.studentRepository = studentRepository;
        this.universityRepository = universityRepository;
        this.fieldOfStudyRepository = fieldOfStudyRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        loadFields();
        loadStudents();
        loadUniversities();
    }

    private void loadStudents(){

    }
    private void loadUniversities(){

    }
    private void loadFields(){

    }

}
