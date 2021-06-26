package com.mongo.repository.mongo_repository.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mongo.repository.mongo_repository.modal.Employee;
import com.mongo.repository.mongo_repository.repository.EmployeeRepository;
import com.mongo.repository.mongo_repository.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Employee> findAll() {
		
		return employeeRepository.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Optional<Employee> findById(String id) {
		
		return employeeRepository.findById(id);
	}
	
	@Override
	@Transactional
	public Employee save(Employee employee) {
		
		return employeeRepository.save(employee);
	}
	
	@Override
	@Transactional
	public void deleteById(String id) {
		
		employeeRepository.deleteById(id);
	}
	
}