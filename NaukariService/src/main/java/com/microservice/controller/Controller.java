package com.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.entity.Employee;
import com.microservice.service.EmpService;

@RestController
public class Controller {
	@Autowired
	private EmpService service;

	@Value("${domainName}")
	String domainName;

	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees() {
		return service.getAllEmployees();

	}

	@GetMapping("/empByName/{name}" + "${domainName}")
	public Employee getEmpByName(@PathVariable("name") String emp_name) {
		return service.getEmpByName(emp_name);

	}

	@PostMapping("/addEmployee")
	public ResponseEntity<String> addEmployee(@RequestBody Employee emp) {
		service.saveEmployee(emp);
		return new ResponseEntity<String>("Employee added successfully", HttpStatus.OK);
	}

}
