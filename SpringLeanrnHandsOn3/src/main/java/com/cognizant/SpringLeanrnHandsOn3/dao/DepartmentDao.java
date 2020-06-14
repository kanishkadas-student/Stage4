package com.cognizant.SpringLeanrnHandsOn3.dao;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import com.cognizant.SpringLeanrnHandsOn3.model.Department;


@Repository
public class DepartmentDao {
	public static List<Department> DEPARTMENT_LIST = new ArrayList<Department>();

	public DepartmentDao() {
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		DEPARTMENT_LIST = (ArrayList<Department>) context.getBean("departmentList");
	}

	public List<Department> getallEmployee() {
		return DEPARTMENT_LIST;
	}
}
