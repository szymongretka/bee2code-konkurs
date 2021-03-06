package pl.szymongretka.bee2code.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class University {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String addition_date;

    @NotBlank(message = "Name cannot be blank")
    private String name;
    private String address;
    private String email;
    private String phone;

    @OneToMany(cascade = CascadeType.ALL)//, fetch = FetchType.LAZY, mappedBy = "university")
    private Set<Student> studentsList = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "university")
    private Set<FieldOfStudy> fieldsOfStudy = new HashSet<>();

    /*public University addStudent(Student student){
        student.setUniversity(this);
        this.studentsList.add(student);
        return this;
    }*/

}
