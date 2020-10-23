package com.employee.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.app.model.departments;
import com.employee.app.model.employees;

public interface employeeRepository extends JpaRepository<employees, Integer> {

	

}
