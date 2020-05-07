package com.jpamorningdemo.jpademo2.repository;

import com.jpamorningdemo.jpademo2.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    @Query(value="select a.id as empId,a.first_name as firstName, a.last_name as lastName, " +
            "a.city,b.id as deptId, b.dept_name as deptName from employee a," +
            "department b where a.dept_id=b.id",nativeQuery = true)
    List<Map<String,Object>> findByEmployeeId(Long id);

    Optional<Employee> findByIdAndFirstName(Long id,String firstName);

    Optional<Employee> findByIdAndFirstNameAndLastName(Long id, String firstName, String lastName);
}
