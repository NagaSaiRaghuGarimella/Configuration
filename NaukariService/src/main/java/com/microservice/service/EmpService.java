package com.microservice.service;

import java.util.List;

import com.microservice.entity.Employee;

public interface EmpService {
	
	 List<Employee> getAllEmployees();
	 
	 Employee getEmpByName(String emp_name);
	 
	 Employee saveEmployee(Employee emp);
	
	

}
