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
		var persons = ObjectsUtils.getPersions();

		var result =persons.stream()
				.map(Person::getPhoneNumber)
				.reduce("",
						(x, y) -> x + y);

		var output = persons.stream()
				.reduce("Phone Concat:",
						(pn,p)->pn+p.getPhoneNumber(),
						String::concat);

		System.out.println(result);
		System.out.println(output);

	}

	private static void reduceDemo2() {
		List<Person> persons = ObjectsUtils.getPersions();

		int totalAge = persons.stream().map(Person::getAge)
				.reduce(0, Integer::sum);

		var result = persons.stream()
				.reduce(0, (ageSum, p)->ageSum+p.getAge(), Integer::sum);

		System.out.println(result);
		System.out.println("Average Age: " + totalAge / persons.size());
	}

	private static void reduceDemo1() {

		List<Integer> list = Arrays.asList(22, 33, 44, 55, 66, 77);
		Integer integer = list.stream().reduce(0, Integer::sum);

		System.out.println(integer);

	}

}
