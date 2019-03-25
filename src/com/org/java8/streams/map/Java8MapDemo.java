package com.org.java8.streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.org.utils.Employee;
import com.org.utils.ObjectsUtils;

public class Java8MapDemo {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("ravi", "divija", "shobha", "Sarala", "bhaskar", "jagan", "jayasri");
//		converUpperCase(names);
//		converUpperCase2(names);
		demo();
	}

	private static void demo() {
		List<Employee> employees = ObjectsUtils.getEmployees();

		List<Employee> employees2 = employees.stream().map(e -> {
			e.setAge(e.getAge() + 100);
			return e;
		}).collect(Collectors.toList());

		Map<Integer, Employee> mapEmpMap = employees.stream().map(e -> {
			e.setAge(e.getAge() + 100);
			return e;
		}).collect(Collectors.toMap(Employee::getId, e -> e));

	}

	private static void converUpperCase2(List<String> names) {
		List<String> names2 = names.stream().filter(t -> t.length() > 6).map(t -> t.concat(" Reddy"))
				.collect(Collectors.toList());
		System.out.println(names2);
	}

	private static void converUpperCase(List<String> names) {

		names.forEach(System.out::println);
		System.out.println("------------");
		names = names.stream().map(new Function<String, String>() {
			@Override
			public String apply(String t) {
//				System.out.println(" apply " + t);
				return t.concat(" Reddy");
			}
		}).filter(new Predicate<String>() {
			@Override
			public boolean test(String t) {
				System.out.println("test " + t);
				return t.length() > 12;
			};
		}).collect(Collectors.toList());
		names.forEach(System.out::println);
	}
}
