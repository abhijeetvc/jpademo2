package com.jpamorningdemo.jpademo2.controller;

import com.jpamorningdemo.jpademo2.domain.Employee;
import com.jpamorningdemo.jpademo2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
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

    @PutMapping(value="/employee/{id}/{name}")
    public Optional<Employee> updateEmployee1(@PathVariable Long id,
                                              @PathVariable String name){
        Optional<Employee> emp=employeeRepository.findById(id);


        return emp;
    }

//    @GetMapping(value="/employee/{id}")
//    public List<Map<String,Object>> getEmployee1(@PathVariable Long id){
//        List<Map<String,Object>> emp=employeeRepository.findByEmployeeId(id);
//        return emp;
//    }

    @GetMapping(value="/employee/{id}/{firstName}/{lastName}")
    public Optional<Employee> getEmployee1(@PathVariable Long id,
                                           @PathVariable String firstName,
                                           @PathVariable String lastName){
        Optional<Employee> emp=employeeRepository.findByIdAndFirstNameAndLastName(id,firstName,lastName);
        return emp;
    }
}
