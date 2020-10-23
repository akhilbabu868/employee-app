package com.employee.app.service;

import java.util.List;
import java.util.Optional;

import com.employee.app.model.employees;



public interface employeeservice {


	List<employees> employeelistAll();
	

	Optional<employees> findById(int id);
	
} 
