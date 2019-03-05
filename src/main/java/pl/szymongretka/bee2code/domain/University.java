package pl.szymongretka.bee2code.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
    //studentsList
    //fieldsOfStudy
}
