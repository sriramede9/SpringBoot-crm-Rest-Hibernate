package com.springboot.CRMBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.CRMBoot.entity.Employeeboot;
import com.springboot.CRMBoot.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/api")
public class HomeController {

	@Autowired
	private EmployeeServiceImpl employeeServiceImpl;

	@GetMapping("/")
	public String home() {
		return "hello use api/employees to get all them employees";
	}

	@GetMapping("/employees")
	public List<Employeeboot> getAll() {
		return employeeServiceImpl.getAll();
	}

}
