package com.mongo.repository.mongo_repository.service;

import java.util.List;
import java.util.Optional;

import com.mongo.repository.mongo_repository.modal.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Optional<Employee> findById(String id);
	
	public Employee save(Employee employee);
	
	public void deleteById(String id);
	
}