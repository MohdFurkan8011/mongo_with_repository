package com.mongo.repository.mongo_repository.mapper;

import com.mongo.repository.mongo_repository.modal.Employee;
import com.mongo.repository.mongo_repository.params.EmployeeParam;

public final class EmployeeMapper {

	private EmployeeMapper() {}
	
	public static Employee mapToEmployee(EmployeeParam employeeParam) {
		
		
		return map(new Employee(), employeeParam);
	}
	
	public static Employee mapToEmployee(Employee employee, EmployeeParam employeeParam) {
		
		return map(employee, employeeParam);
	}
	
	public static Employee map(Employee employee, EmployeeParam employeeParam) {
		
		employee.setFirstName(employeeParam.getFirstName());
		employee.setLastName(employeeParam.getLastName());
		employee.setAddress(employeeParam.getAddress());
		
		return employee;
	}
	
}