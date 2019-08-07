package com.springboot.CRMBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.CRMBoot.dao.CustomerDaoImpl;
import com.springboot.CRMBoot.entity.Employeeboot;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private CustomerDaoImpl customerDaoImpl;

	@Override
	public List<Employeeboot> getAll() {
		// TODO Auto-generated method stub
		return customerDaoImpl.getAll();
	}

	@Override
	public Employeeboot getbyId(int id) {
		// TODO Auto-generated method stub
		return customerDaoImpl.getbyId(id);
	}

	@Override
	public void addEmployee(Employeeboot e) {
		// TODO Auto-generated method stub
		customerDaoImpl.addEmployee(e);

	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		customerDaoImpl.deleteEmployee(id);

	}

}
