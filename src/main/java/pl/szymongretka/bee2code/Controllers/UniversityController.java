package pl.szymongretka.bee2code.Controllers;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import pl.szymongretka.bee2code.Services.UniversityService;
import pl.szymongretka.bee2code.domain.Student;
import pl.szymongretka.bee2code.domain.University;

import java.util.List;

@RestController
@RequestMapping("/university")
public class UniversityController {

    private final UniversityService universityService;

    public UniversityController(UniversityService universityService) {
        this.universityService = universityService;
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<University> getAllUniversities(){
        return universityService.findAllUniversities();
    }

    @GetMapping("/students")
    @ResponseStatus(HttpStatus.OK)
    public List<Student> getAllStudents(){
        return universityService.getListOFStudents();
    }

}
