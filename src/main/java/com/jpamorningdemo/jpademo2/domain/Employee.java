package com.jpamorningdemo.jpademo2.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Generated;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private Double salary;
    private String city;
    private String address;

    @ManyToOne
    @JoinColumn(name = "dept_id")
    @JsonBackReference
    private Department department;

}
