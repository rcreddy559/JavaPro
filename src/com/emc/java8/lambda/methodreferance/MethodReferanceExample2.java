package com.emc.java8.lambda.methodreferance;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.emc.util.Person;

public class MethodReferanceExample2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Ravi", "chandra", 36), 
				new Person("Shobha", "Penumuru", 31),
				new Person("Jagan", "Mohan", 41), 
				new Person("Jyothis", "penumuru", 8),
				new Person("Sohith", "Reddy", 6), 
				new Person("Divija", "chandra", 4));

		
		System.out.println("--------printAllWithNameBegin-------");
		performAllCondition(people, (p) -> p.getLastName().startsWith("c"), System.out::println);

	}

	private static void performAllCondition(List<Person> people, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p))
				consumer.accept(p);
		}
	}

}
