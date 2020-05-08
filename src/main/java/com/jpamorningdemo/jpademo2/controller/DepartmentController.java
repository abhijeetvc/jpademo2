package com.jpamorningdemo.jpademo2.controller;

import com.jpamorningdemo.jpademo2.domain.Department;
import com.jpamorningdemo.jpademo2.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @PostMapping(value="/savedept")
    public String saveDept(@RequestBody Department department){

        departmentRepository.save(department);
        return "Data Saved";
    }

    @GetMapping(value="/department/{deptId}")
    public Optional<Department> getDept(@PathVariable Long deptId){
        Optional<Department> department=departmentRepository.findById(deptId);
        return department;
    }
}
