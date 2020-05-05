package com.jpamorningdemo.jpademo2.repository;

import com.jpamorningdemo.jpademo2.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
