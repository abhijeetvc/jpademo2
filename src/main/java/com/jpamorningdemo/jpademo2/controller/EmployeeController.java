package com.jpamorningdemo.jpademo2.controller;

import com.jpamorningdemo.jpademo2.domain.Employee;
import com.jpamorningdemo.jpademo2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping(value="/save")
    public String saveEmployee(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "Data saved";
    }

    @GetMapping(value="/employee")
    public List<Employee> getEmployee(){
        List<Employee> list=employeeRepository.findAll();
        return list;
    }

    @GetMapping(value="/employee/{id}")
    public Optional<Employee> getEmployee1(@PathVariable Long id){
        Optional<Employee> emp=employeeRepository.findById(id);
        return emp;
    }
}
