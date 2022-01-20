package com.Neosoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Neosoft.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
