package com.mongo.repository.mongo_repository.service;

import java.util.List;
import java.util.Optional;

import com.mongo.repository.mongo_repository.modal.Student;

public interface StudentService {

	public List<Student> findAll();
	
	public Optional<Student> findById(String studentId);
	
	public Student saveOrUpdate(Student student);
	
}
