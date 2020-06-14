package com.cognizant.SpringLeanrnHandsOn3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.SpringLeanrnHandsOn3.dao.EmployeeDao;
import com.cognizant.SpringLeanrnHandsOn3.model.Employee;
import com.cognizant.SpringLeanrnHandsOn3.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/employees")
	public List<Employee> getallEmployee() {
		return employeeService.getAllEmployee();
	}

	@PutMapping("/employees/{id}")
	public Employee update(@RequestBody Employee employee, @PathVariable int id) {
		for (Employee e : EmployeeDao.EMPLOYEE_LIST) {
			if (e.getId() == id) {
				e.setName(employee.getName());
				e.setSalary(employee.getSalary());
				e.setDepartment(employee.getDepartment());
			}
		}
		return employee;
	}
	
}
