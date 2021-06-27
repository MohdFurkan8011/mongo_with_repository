package com.mongo.repository.mongo_repository.mapper;

import org.modelmapper.ModelMapper;

import com.mongo.repository.mongo_repository.modal.Student;
import com.mongo.repository.mongo_repository.params.StudentParam;

public class StudentMapper {

	private StudentMapper() {
	}

	public static Student mapToStudent(StudentParam studentParam) {

		return mapping(new Student(), studentParam);
	}

	public static Student mapToStudent(Student student, StudentParam studentParam) {

		return mapping(student, studentParam);
	}

	public static Student mapping(Student student, StudentParam studentParam) {

		ModelMapper modelMapper = new ModelMapper();
		modelMapper.map(studentParam, student);

		return student;
	}

}
