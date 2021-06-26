package com.mongo.repository.mongo_repository.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

@Document(collection = "employee_register")
@Data
public class Employee {

	@Id
	private String id;
	
	@Field(name = "firstName")
	private String firstName;
	
	@Field(name = "lastName")
	private String lastName;
	
	@Field(name = "address")
	private String address;
	
}