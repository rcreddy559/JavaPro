package com.org.java8.BuiltInFunctionalInterface;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.org.utils.Employee;
import com.org.utils.ObjectsUtils;
import com.org.utils.Person;

public class PredicateDemo {

	public static void main(String[] args) {
		new PredicateDemo().predicateAnd();
	}

	static private void predicateAnd() {
		List<Employee> employees = ObjectsUtils.getEmployees();

		Predicate<Employee> agePredicate = e -> e.getAge() > 20;
		Predicate<Employee> genderPredicate = e -> e.getGender().equals("Male");

		List<String> list = employees.stream().filter(agePredicate.and(genderPredicate)).map(Employee::getFirstName)
				.collect(Collectors.toList());
		list.forEach(System.out::println);

	}

	static private void nagateDemo() {
		Predicate<Integer> oddPredicate = i -> i % 2 == 0;
		Predicate<Integer> evenPredicate = oddPredicate.negate();

		List<Integer> list = ObjectsUtils.getListOfIntegers();
		list.sort(Comparator.naturalOrder());

		List<Integer> addList = list.stream().filter(oddPredicate).collect(Collectors.toList());
		List<Integer> evenList = list.stream().filter(evenPredicate).collect(Collectors.toList());

		addList.forEach(System.out::println);
		System.out.println("-------");
		evenList.forEach(System.out::println);
	}

	private void demo() {
		Predicate<Person> personPredicate = (p) -> p.getAge() < 10;

		List<Person> personList = ObjectsUtils.getPersions();

		personList.stream().filter(personPredicate).collect(Collectors.toList())
				.forEach(p -> System.out.println(p.toString()));

	}

	private void demo1() {
		Predicate<Integer> preInt = i -> i < 20;
		System.out.println(preInt.test(100));

	}

	private void demo2() {
		Predicate<Integer> greaterThanTen = (i) -> i > 10;

		// Creating predicate
		Predicate<Integer> lowerThanTwenty = (i) -> i < 20;

		boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
		System.out.println(result);
	}

	private void demo3() {
		List<Integer> list = ObjectsUtils.getListOfIntegers();

		list.forEach(System.out::println);
		System.out.println("-----------");
		list.removeIf(i -> i > 8);
		list.forEach(System.out::println);

	}
}
