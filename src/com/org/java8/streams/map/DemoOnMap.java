package com.org.java8.streams.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.org.utils.Employee;
import com.org.utils.ObjectsUtils;
import com.org.utils.Person;

public class DemoOnMap {

	public static void main(String[] args) {
		demo4();
	}

	private static void demo4() {
		Map<Integer, Employee> empMap = new HashMap<>();
		ObjectsUtils.getEmployees().forEach(emp -> empMap.put(emp.getId(), emp));

		empMap.forEach((k, e) -> System.out.println(k + ": " + e.toString()));
		Stream<Entry<Integer, Employee>> emp1 = empMap.entrySet().stream().filter(emp -> emp.getValue().getAge() == 30);
		System.out.println("------------------");
		emp1.forEach(e -> System.out.println(e.toString()));

	}

	private static void demo3() {
		List<Employee> empList = ObjectsUtils.getEmployees();

		empList.stream().map(emp -> {
			Employee secondEmp = emp;
			secondEmp.setFirstName(secondEmp.getFirstName() + ", " + secondEmp.getLastName());
			return secondEmp;
		}).collect(Collectors.toList());
		empList.forEach(emp -> System.out.println(emp.getFirstName()));

	}

	private static void demo2() {
		List<Person> personsList = ObjectsUtils.getPersions();
		List<String> firstNamesList = personsList.stream().map(p -> p.getFirstName()).collect(Collectors.toList());
		firstNamesList.forEach(s -> System.out.print(s + ", "));
	}

	private static void demo1() {
		List<Integer> listInts = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 1, 2, 32);
		listInts.forEach(i -> {
			System.out.print(i + ", ");
		});

		List<Integer> listIntsMap = listInts.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		System.out.println();
		listIntsMap.forEach(i -> {
			System.out.print(i + ", ");
		});

		List<String> listIntsMapStr = listInts.stream().map(i -> i + ": upper").distinct().collect(Collectors.toList());
		System.out.println();
		listIntsMapStr.forEach(i -> {
			System.out.print(i + ", ");
		});
	}
}
