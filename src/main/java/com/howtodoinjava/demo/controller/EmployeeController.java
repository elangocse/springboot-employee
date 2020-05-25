package com.howtodoinjava.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.howtodoinjava.demo.model.Employee;

@RestController
public class EmployeeController {
	
	@RequestMapping("/emp")
    public List<Employee> getEmployees() 
    {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1,"elango","boopathy","elango.boopathy@example.com"));
		return employeesList;
    }

}
