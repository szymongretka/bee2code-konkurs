package pl.szymongretka.bee2code.Controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import pl.szymongretka.bee2code.Services.UniversityService;
import pl.szymongretka.bee2code.domain.Student;
import pl.szymongretka.bee2code.domain.University;

import javax.validation.Valid;
import java.util.*;

@RestController
@RequestMapping("/university")
@CrossOrigin
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

    @PostMapping("/all")
    public ResponseEntity<?> saveUniversity(@Valid @RequestBody University university, BindingResult result){

        if(result.hasErrors()){
            Map<String, String> errorMap = new HashMap<>();

            for(FieldError error : result.getFieldErrors()){
                errorMap.put(error.getField(), error.getDefaultMessage());
            }
            return new ResponseEntity<>(errorMap, HttpStatus.BAD_REQUEST);
        }
        University uni = universityService.save(university);
        return new ResponseEntity<>(uni, HttpStatus.CREATED);
    }

    /*@GetMapping("/{name}")
    @ResponseStatus(HttpStatus.OK)
    public University getUniversityByName(@PathVariable String name){
        return universityService.findByName(name);
    }*/

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<University> getUniversityById(@PathVariable Long id){
        return universityService.findById(id);
    }

    @GetMapping("/students")
    @ResponseStatus(HttpStatus.OK)
    public List<Student> getAllStudents(){
        return universityService.getListOFStudents();
    }

    @GetMapping("/{name}/students")
    @ResponseStatus(HttpStatus.OK)
    public Set<Student> getStudentsFromUniversity(@PathVariable String name){
        return universityService.findStudentsFromUniversity(name);
    }

    @PutMapping("/{id}")
    public University replaceUniversity(@RequestBody University newUniversity, @PathVariable Long id) {

        return universityService.findById(id)
                .map(university -> {
                    university.setName(newUniversity.getName());
                    //university.setAddress(newUniversity.getAddress()); //TODO
                    return universityService.save(university);
                })
                .orElseGet(() -> {
                    newUniversity.setId(id);
                    return universityService.save(newUniversity);
                });
    }

    @DeleteMapping("/{id}")
    public void deleteUniversity(@PathVariable Long id) {
        universityService.deleteById(id);
    }

}
