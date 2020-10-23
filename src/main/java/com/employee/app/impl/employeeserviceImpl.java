package com.employee.app.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import com.employee.app.model.employees;
import com.employee.app.repository.employeeRepository;
import com.employee.app.service.employeeservice;

@SuppressWarnings("unused")
@Service
@Transactional
public class employeeserviceImpl implements  employeeservice{

	
private final employeeRepository repo;
	
    public employeeserviceImpl(employeeRepository repo) {
    	this.repo=repo;
    }

	@Override
	public List<employees> employeelistAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
    
		  

	

	@Override
	public Optional<employees> findById(int id) {
		// TODO Auto-generated method stub
		 return repo.findById(id);
	}
    
   



}
