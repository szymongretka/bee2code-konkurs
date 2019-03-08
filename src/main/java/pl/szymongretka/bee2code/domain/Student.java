package pl.szymongretka.bee2code.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude="university")
public class Student {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Integer age;
    private Double averageGrade;

    @ManyToOne(fetch = FetchType.LAZY)
    private University university;

    @OneToMany(mappedBy = "student")
    private Set<FieldOfStudy> fieldsOfStudy = new HashSet<>();

    @Enumerated(value = EnumType.STRING)
    private GENDER gender;

    @Enumerated(value = EnumType.STRING)
    private STUDENT_STATUS student_status;

    public Student(String firstName, String lastName, String email, String phone, Integer age, Double averageGrade,
             Set<FieldOfStudy> fieldsOfStudy, GENDER gender, STUDENT_STATUS student_status) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.averageGrade = averageGrade;
        this.fieldsOfStudy = fieldsOfStudy;
        this.gender = gender;
        this.student_status = student_status;
    }

}
