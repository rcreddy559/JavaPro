package com.org.utils;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import com.org.exceptions.EducationException;
import com.org.models.EduEmployee;


public class EmpUtils {

	
	Set<EduEmployee> employees = FilesUtil.getEmployees();
	
	public static void main(String[] args) {
		new EmpUtils().getEmployees();
	}
	
	public Set<EduEmployee> getEmployees() {
		return employees;
	}
	
	public EduEmployee getEmployee(String employeeNum) {
		
		EduEmployee employee = null;
		Optional<EduEmployee> employeeOptional = null;

		Stream<EduEmployee> s = employees.stream().filter((e) -> {
			return e.getEmployeeNum().equals(employeeNum);
		});
		try {
			employeeOptional = s.findFirst();
			employee = employeeOptional.get();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee;
	}

	public boolean deleteEmployee(String employeeNum) {
		return employees.removeIf(e->e.getEmployeeNum().equals(employeeNum));
	}

	public void createEmployee(EduEmployee employee) throws EducationException {
		 final EduEmployee employeeNew = getEmployee(employee.getEmployeeNum());
		 if(employeeNew == null) {
			 employees.add(employee);
		 } else {
			 throw new EducationException("Employee Exits; "+employee.toString());
		 }
	}
	public boolean update(EduEmployee employee) {
		return employees.add(employee);
	}
}
