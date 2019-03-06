package pl.szymongretka.bee2code.domain;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class FieldOfStudy {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    //private Long universityId;
    private String nameOfStudyField;
    private String startDate;
    private String studentsLimit;

    @ManyToOne
    private University university;

    @ManyToOne
    private Student student;

}
