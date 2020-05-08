package com.jpamorningdemo.jpademo2.domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String deptName;

    @OneToMany(mappedBy = "department")
    @JsonManagedReference
    Set<Employee> employeeList;

}
