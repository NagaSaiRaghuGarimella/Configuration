package com.microservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, String> {

}
