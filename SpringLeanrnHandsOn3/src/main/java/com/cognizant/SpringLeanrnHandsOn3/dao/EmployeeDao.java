package com.cognizant.SpringLeanrnHandsOn3.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.SpringLeanrnHandsOn3.model.Employee;

@Repository 
public class EmployeeDao {
	public static List<Employee> EMPLOYEE_LIST =  new ArrayList<Employee>();
	
	public EmployeeDao() {
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		EMPLOYEE_LIST = (ArrayList<Employee>) context.getBean("employeeList");
	}
	
	public List<Employee> getAllEmployee(){
		return EMPLOYEE_LIST;
	}
}
