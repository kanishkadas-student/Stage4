package com.cognizant.SpringLeanrnHandsOn3.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.SpringLeanrnHandsOn3.dao.EmployeeDao;
import com.cognizant.SpringLeanrnHandsOn3.model.Employee;

@Service
public class EmployeeService {
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);
	
	@Autowired
	private EmployeeDao employeeDao;
	
	public EmployeeService() {
		LOGGER.debug("Employee Service Called");
		
	}
	
	public List<Employee> getAllEmployee(){
		return employeeDao.getAllEmployee();
	}
}
