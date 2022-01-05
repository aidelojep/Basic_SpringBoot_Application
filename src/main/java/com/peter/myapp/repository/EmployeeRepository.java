package com.peter.myapp.repository;

import com.peter.myapp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long > {

}
