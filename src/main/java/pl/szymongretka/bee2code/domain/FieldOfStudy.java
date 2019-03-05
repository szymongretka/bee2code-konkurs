package pl.szymongretka.bee2code.domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class FieldOfStudy {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private Long universityId;
    private String nameOfStudyField;
    private String startDate;
    private String studentsLimit;

}
