package com.springboot.CRMBoot.dao;

import java.util.List;

import com.springboot.CRMBoot.entity.Employeeboot;

public interface CustomerDao {

	public List<Employeeboot> getAll();
	
	public Employeeboot getbyId(int id);
	
	public void addEmployee(Employeeboot e);
		
	public void deleteEmployee(int id);
	
}
