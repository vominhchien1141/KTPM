package com.example.redisDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.redisDemo.entity.Employee;
import com.example.redisDemo.repository.EmployeeRepository;



@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping
	public List<Employee> getAll(){
		return employeeRepository.findAll();
	}
	
	@PostMapping
	public Employee save(@RequestBody Employee employee) {
		employeeRepository.save(employee);
		return employee;
	}
}
