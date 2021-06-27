package com.mongo.repository.mongo_repository.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mongo.repository.mongo_repository.modal.Student;
import com.mongo.repository.mongo_repository.repository.StudentRepository;
import com.mongo.repository.mongo_repository.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	@Transactional(readOnly = true)
	public List<Student> findAll() {
		
		return studentRepository.findAll();
	}
	
	@Override
	@Transactional(readOnly = true)
	public Optional<Student> findById(String studentId) {
		
		return studentRepository.findById(studentId);
	}
	
	@Override
	@Transactional(readOnly = true)
	public Student saveOrUpdate(Student student) {
	
		return studentRepository.save(student);
	}
	
}