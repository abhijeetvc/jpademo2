package com.jpamorningdemo.jpademo2.controller;

import com.jpamorningdemo.jpademo2.domain.Department;
import com.jpamorningdemo.jpademo2.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @PostMapping(value="/savedept")
    public String saveDept(@RequestBody Department department){
        departmentRepository.save(department);
        return "Data Saved";
    }
}
