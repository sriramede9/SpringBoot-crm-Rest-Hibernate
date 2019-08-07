package com.springboot.CRMBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
		return "hello use api/employee to get all them employees";
	}

	@GetMapping("/employee")
	public List<Employeeboot> getAll() {
		return employeeServiceImpl.getAll();
	}

	@PostMapping("/employee")
	public void addEmployee(@RequestBody Employeeboot empobj) {
		// just in case if an id is added to the incomming obj set id to 0
		empobj.setId(0);
		employeeServiceImpl.addEmployee(empobj);
	}

	@PutMapping("/employee")
	public void updateEmployee(@RequestBody Employeeboot empobj) {
		employeeServiceImpl.addEmployee(empobj);
	}

	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable Integer id) {
		employeeServiceImpl.deleteEmployee(id);
	}

	// get by id
	@GetMapping("/employee/{id}")
	public Employeeboot getempbyId(@PathVariable Integer id) {
		return employeeServiceImpl.getbyId(id);
	}

}
