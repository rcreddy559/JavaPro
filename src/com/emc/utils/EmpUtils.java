package com.emc.utils;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.emc.exceptions.EducationException;
import com.emc.models.EduEmployee;

@Component
public class EmpUtils {

	final static private Logger logger = org.apache.log4j.LogManager.getLogger(EmpUtils.class);
	Set<EduEmployee> employees = FilesUtil.getEmployees();
	
	public static void main(String[] args) {
		new EmpUtils().getEmployees();
	}
	
	public Set<EduEmployee> getEmployees() {
		
		return employees;
	}
	
	public EduEmployee getEmployee(String employeeNum) {
		logger.debug("employees size : " + employees.size());
		
		EduEmployee employee = null;
		Optional<EduEmployee> employeeOptional = null;

		Stream<EduEmployee> s = employees.stream().filter((e) -> {
			return e.getEmployeeNum().equals(employeeNum);
		});
		try {
			employeeOptional = s.findFirst();
			employee = employeeOptional.get();
		} catch (Exception e) {
			logger.error("No employee found with employeeNum:"+employeeNum);
			e.printStackTrace();
		}
		
		return employee;
	}

	public boolean deleteEmployee(String employeeNum) {
		return employees.removeIf(e->e.getEmployeeNum().equals(employeeNum));
	}

	public void createEmployee(EduEmployee employee) throws EducationException {
		 final EduEmployee employeeNew = getEmployee(employee.getEmployeeNum());
		 logger.debug("employeeNew : "+employeeNew);
		 if(employeeNew == null) {
			 employees.add(employee);
			 logger.debug("New Employee create successfully  : "+employee.toString());
		 } else {
			 logger.debug("employeeNew : "+employeeNew.toString());
			 throw new EducationException("Employee Exits; "+employee.toString());
		 }
		
	}

	public boolean update(EduEmployee employee) {
		return employees.add(employee);
	}

}
