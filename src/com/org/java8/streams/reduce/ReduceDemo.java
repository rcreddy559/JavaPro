package com.org.java8.streams.reduce;

import java.util.Arrays;
import java.util.List;

import com.org.utils.ObjectsUtils;
import com.org.utils.Person;

public class ReduceDemo {

	public static void main(String[] args) {

		reduceDemo1();
		reduceDemo2();
		reduceMapReduce();
	}

	private static void reduceMapReduce() {
		List<Person> persons = ObjectsUtils.getPersions();

		persons.stream().map(Person::getPhoneNumber).reduce("", (x, y) -> x + y);

	}

	private static void reduceDemo2() {
		List<Person> persons = ObjectsUtils.getPersions();

		int totalAge = persons.stream().map(Person::getAge).reduce(0, (x, y) -> x + y);
		System.out.println("Average Age: " + totalAge / persons.size());

	}

	private static void reduceDemo1() {

		List<Integer> list = Arrays.asList(22, 33, 44, 55, 66, 77);
		Integer integer = list.stream().reduce(0, (x, y) -> x + y);

		System.out.println(integer);

	}

}
