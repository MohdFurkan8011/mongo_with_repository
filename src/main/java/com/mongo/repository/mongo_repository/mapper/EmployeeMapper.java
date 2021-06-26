package com.mongo.repository.mongo_repository.mapper;

import org.modelmapper.ModelMapper;

import com.mongo.repository.mongo_repository.modal.Employee;
import com.mongo.repository.mongo_repository.params.EmployeeParam;

public final class EmployeeMapper {

	private EmployeeMapper() {}
	
	public static Employee mapToEmployee(EmployeeParam employeeParam) {
		
		
		return mapping(new Employee(), employeeParam);
	}
	
	public static Employee mapToEmployee(Employee employee, EmployeeParam employeeParam) {
		
		return mapping(employee, employeeParam);
	}
	
	public static Employee mapping(Employee employee, EmployeeParam employeeParam) {
		
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.map(employeeParam, employee);
		
		return employee;
	}
	
}