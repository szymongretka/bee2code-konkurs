package pl.szymongretka.bee2code.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Student {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private int age;
    private enum GENDER{
        male,
        female
    }
    private enum STUDENT_STATUS{
        active,
        suspended,
        deans_leave
    }
    private double averageGrade;
    //fieldsOfStudy


}
