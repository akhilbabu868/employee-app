package com.employee.app.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.employee.app.model.departments;
import com.employee.app.model.employees;
import com.employee.app.service.employeeservice;

@RestController
public class employeecontroller {

	@Autowired
	private employeeservice service;

	@PostMapping("/employee")
	public List<employees> employeeList() {

		List<employees> emp = service.employeelistAll();
		return emp;
	}
	
	//Starting Point of Spring-Boot App

	@GetMapping("/")
	public ModelAndView mv(Model model) {
		model.addAttribute("employees", service.employeelistAll());
		ModelAndView mv = new ModelAndView("Index");
		return mv;
	}
	
	
	//Function Return Employee By ID

	@RequestMapping("/employeedetails/{id}")
	public ModelAndView employee(@PathVariable("id") int id, Model model) {

		System.out.println("id==========" + id);

		Optional<employees> emp = service.findById(id);

		if (emp.isPresent())

			model.addAttribute("details", emp.get());
		ModelAndView mv = new ModelAndView("Employee");
		return mv;

	}

}
