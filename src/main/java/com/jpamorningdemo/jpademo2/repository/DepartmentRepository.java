package com.jpamorningdemo.jpademo2.repository;

import com.jpamorningdemo.jpademo2.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
