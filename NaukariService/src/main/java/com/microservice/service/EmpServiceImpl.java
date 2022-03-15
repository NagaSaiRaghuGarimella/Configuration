package com.microservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.entity.Employee;
import com.microservice.repository.EmpRepository;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpRepository repo;

	@Override
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

	@Override
	public Employee getEmpByName(String emp_name) {
		return repo.findById(emp_name).get();
	}

	@Override
	public Employee saveEmployee(Employee emp) {
		return repo.save(emp);
	}

}
