package com.cognizant.SpringLeanrnHandsOn3.service;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.SpringLeanrnHandsOn3.dao.DepartmentDao;
import com.cognizant.SpringLeanrnHandsOn3.model.Department;


@Service
public class DepartmentService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentService.class);

	@Autowired
	private DepartmentDao departmentDao;

	public DepartmentService() {
		LOGGER.debug("Department Rest Service Called!");
	}

	public List<Department> getallEmployee() {
		return departmentDao.getallEmployee();
	}
	
}
