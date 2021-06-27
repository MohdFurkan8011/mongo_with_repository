package com.mongo.repository.mongo_repository.modal;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document(collection = "student")
@Data
public class Student {

	@Id
//	@Field(name = "studentId")
	private String studentId;
	
	private String firstName;
	private String lastName;
	
	private Address address;
	private List<Course> courses;

}
