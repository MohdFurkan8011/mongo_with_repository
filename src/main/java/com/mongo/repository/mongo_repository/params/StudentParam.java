package com.mongo.repository.mongo_repository.params;

import java.util.List;

import com.mongo.repository.mongo_repository.modal.constant.Gender;

import lombok.Data;

@Data
public class StudentParam {

	private String firstName;
	private String lastName;
	
	private AddressParam address;
	private List<CourseParam> courses;
	
	private Gender gender;
	
}