package com.springboot.CRMBoot.dao;

import java.util.List;


import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.CRMBoot.entity.Employeeboot;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	//entity manager auto generated by spring
	private EntityManager entityManager;
	
	

	//construction injection
	@Autowired
	public CustomerDaoImpl(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}



	@Override
	@Transactional
	public List<Employeeboot> getAll() {
		// TODO Auto-generated method stub
		
		//get current hibernate session
		Session currentSession=entityManager.unwrap(Session.class);
		
		//create query//get it from org.hibernate.query
		
		Query<Employeeboot> thequery=currentSession.createQuery("from Employeeboot",Employeeboot.class);
		
		//execute query and get result list
		
		
		List<Employeeboot> employees =thequery.getResultList();
		
		//return
		
		return employees;
	}



	@Override
	@Transactional
	public Employeeboot getbyId(int id) {
		// TODO Auto-generated method stub
		Session currentSession=entityManager.unwrap(Session.class);

		Employeeboot theEmployee=currentSession.get(Employeeboot.class,id);

		return theEmployee;
	}



	@Override
	@Transactional
	public void addEmployee(Employeeboot e) {
		// TODO Auto-generated method stub
		Session currentSession=entityManager.unwrap(Session.class);

		currentSession.saveOrUpdate( e);
	}



	@Override
	@Transactional
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
		Session currentSession=entityManager.unwrap(Session.class);

	Employeeboot empobj=currentSession.get(Employeeboot.class, id);
		
		currentSession.delete(empobj);
	}

}
