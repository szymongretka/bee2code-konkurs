package pl.szymongretka.bee2code.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class University {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String addition_date;
    private String name;
    private String address;
    private String email;
    private String phone;
    private String items;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "university")
    private Set<Student> studentsList = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "university")
    private Set<FieldOfStudy> fieldsOfStudy = new HashSet<>();

}
