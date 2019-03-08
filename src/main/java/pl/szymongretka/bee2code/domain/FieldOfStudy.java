package pl.szymongretka.bee2code.domain;

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

    @ManyToOne(fetch = FetchType.LAZY)
    private University university;

    @ManyToOne(fetch = FetchType.LAZY)
    private Student student;

}
