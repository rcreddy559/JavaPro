package com.org.java8.streams.filter;

import java.util.List;
import java.util.Optional;

import com.org.utils.Employee;
import com.org.utils.ObjectsUtils;

public class FilterFindAnyOrElse {

	public static void main(String[] args) {
		List<Employee> empList = ObjectsUtils.getEmployees();

		findByName("Divija", empList);
	}

	private static void findByName(String name, List<Employee> empList) {

		Optional<Employee> employee = empList.stream().filter(e -> e.getFirstName().equalsIgnoreCase(name)).findAny();

		System.out.println(employee.toString());
	}

	private static void findByNameFindFirst(String name, List<Employee> empList) {

		Optional<Employee> employee = empList.stream().filter(e -> e.getFirstName().equalsIgnoreCase(name)).findFirst();

		System.out.println(employee.toString());
	}

}
