package com.org.java.functionalinterface;

import java.util.List;
import java.util.stream.Stream;

import com.org.utils.Employee;
import com.org.utils.ObjectsUtils;

public class PedicateDemo {

	public static void main(String[] args) {
		demo1();

	}

	private static void demo1() {
		List<Employee> empList = ObjectsUtils.getEmployees();
		System.out.println("empList size before Predicate: "+empList.size());
		
		empList.forEach((e) -> {
			System.out.println(e.toString());
		});
		
		System.out.println("---------------------------------------");
		Stream<Employee> empStream = empList.stream().filter((e) -> e.getGender().equalsIgnoreCase("Male"))
				.filter((e)->e.getId()< 20);
		
		empStream.forEach((e)->{System.out.println(e.toString());});
	}

}
