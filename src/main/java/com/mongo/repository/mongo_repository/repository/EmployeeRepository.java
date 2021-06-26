package com.mongo.repository.mongo_repository.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mongo.repository.mongo_repository.modal.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
	
	public List<Employee> findByFirstName(String firstName);
}