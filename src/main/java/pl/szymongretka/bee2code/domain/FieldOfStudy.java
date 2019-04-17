package pl.szymongretka.bee2code.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class FieldOfStudy {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String nameOfStudyField;
    private String startDate;
    private String studentsLimit;

    @ManyToOne(fetch = FetchType.LAZY)
    private University university;

    @ManyToOne(fetch = FetchType.LAZY)
    private Student student;

}
