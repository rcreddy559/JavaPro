package com.org.java8.Comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.org.utils.Employee;
import com.org.utils.ObjectsUtils;

public class ComparatorInJava8 {

	public static void main(String[] args) {
//		demoComparator();
//		demoComparatorComparing();
		demoComparatorComparingInt();
	}

	private static void demoComparatorComparingInt() {
		Comparator<Employee> emp = Comparator.comparing(Employee::getId);
		List<Employee> employees = ObjectsUtils.getEmployees();
		Collections.sort(employees, emp);
		employees.forEach(e -> System.out.println(e.toString()));
	}

	private static void demoComparatorComparing() {
		Comparator<Employee> empComparator = Comparator.comparing(Employee::getAge);
		List<Employee> employees = ObjectsUtils.getEmployees();
		Collections.sort(employees, empComparator);

		employees.forEach(e -> System.out.println(e.toString()));

	}

	private static void demoComparator() {
		System.out.println("--");
		Comparator<Employee> empComparable = (Employee e1, Employee e2) -> e1.getFirstName()
				.compareTo(e2.getFirstName());

		List<Employee> employees = ObjectsUtils.getEmployees();
		System.out.println(employees.size());
		employees.forEach(e -> System.out.println(e.getFirstName()));
		employees.sort(empComparable);

		employees.forEach(Employee::getFirstName);
		System.out.println("--------=========");
		employees.forEach(e -> System.out.println(e.getFirstName()));
	}

}
