package pl.szymongretka.bee2code.Data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import pl.szymongretka.bee2code.Repositories.FieldOfStudyRepository;
import pl.szymongretka.bee2code.Repositories.StudentRepository;
import pl.szymongretka.bee2code.Repositories.UniversityRepository;
import pl.szymongretka.bee2code.domain.*;

import java.util.HashSet;
import java.util.Set;

@Configuration
public class DataLoader implements CommandLineRunner {

    private final StudentRepository studentRepository;
    private final UniversityRepository universityRepository;
    private final FieldOfStudyRepository fieldOfStudyRepository;

    public DataLoader(StudentRepository studentRepository, UniversityRepository universityRepository,
                      FieldOfStudyRepository fieldOfStudyRepository) {
        this.studentRepository = studentRepository;
        this.universityRepository = universityRepository;
        this.fieldOfStudyRepository = fieldOfStudyRepository;
    }


    @Override
    public void run(String... args) throws Exception {
        //loadFields();
        //loadStudents();
        loadUniversities();
    }

    private void loadStudents(){
        /*Student student1 = new Student();
        Student student2 = new Student();

        student1.setAge(18);
        student1.setEmail("student@email.com");
        student1.setGender(GENDER.male);
        student1.setStudent_status(STUDENT_STATUS.active);
        student1.setPhone("345534");

        student2.setAge(20);
        student2.setEmail("student2@email.com");
        student2.setGender(GENDER.female);
        student2.setStudent_status(STUDENT_STATUS.suspended);
        student2.setPhone("89834");*/

    }
    private void loadUniversities(){

        Set<FieldOfStudy> automatyka = new HashSet<>();
        University politechnika = new University();
        University uni2 = new University();


        politechnika.setAddition_date("14.02");
        politechnika.setAddress("akademicka");
        politechnika.setEmail("dziekanat@polsl.pl");
        politechnika.setName("SUT");
        politechnika.setPhone("54486");

        politechnika.getStudentsList().add(new Student( "ham", "nazwisko", "email@email",
                "65656", 22, 4.02, automatyka,  GENDER.male, STUDENT_STATUS.deans_leave));
        politechnika.getStudentsList().add(new Student( "drugi", "edek", "123@email",
                "65656", 21, 4.02, automatyka,  GENDER.female, STUDENT_STATUS.active));


        uni2.setAddition_date("14.12");
        uni2.setAddress("kujawska");
        uni2.setEmail("nic@polsl.pl");
        uni2.setName("AEI");
        uni2.setPhone("8888");

        universityRepository.save(politechnika);
        universityRepository.save(uni2);

    }
    private void loadFields(){

    }

}
