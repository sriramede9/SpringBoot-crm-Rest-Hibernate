package com.springboot.CRMBoot.service;

import java.util.List;

import com.springboot.CRMBoot.entity.Employeeboot;

public interface EmployeeService {

	public List<Employeeboot> getAll();

	public Employeeboot getbyId(int id);

	public void addEmployee(Employeeboot e);

	public void deleteEmployee(int id);
}
