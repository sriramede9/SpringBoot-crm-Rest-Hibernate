package com.springboot.CRMBoot.JpaRepositoryDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.CRMBoot.entity.Employeeboot;

public interface EmployeeJpaRepository extends JpaRepository<Employeeboot, Integer> {

}
