package com.cognizant.SpringLeanrnHandsOn3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.SpringLeanrnHandsOn3.dao.DepartmentDao;
import com.cognizant.SpringLeanrnHandsOn3.model.Department;
import com.cognizant.SpringLeanrnHandsOn3.service.DepartmentService;

@RestController
public class DepartmentController {

	@Autowired
	DepartmentService departmentService;

	@GetMapping("/departments")
	public List<Department> getallEmployee() {
		return departmentService.getallEmployee();
	}

	@PutMapping("/departments/{id}")
	public Department update(@RequestBody Department department, @PathVariable int id) {
		for (Department d : DepartmentDao.DEPARTMENT_LIST) {
			if (d.getId() == id) {
				d.setName(department.getName());
				d.setLocation(department.getLocation());
			}
		}
		return department;
	}

}