package com.org.java8.lambda.methodreferance;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.emc.utils.ObjectsUtils;
import com.emc.utils.Person;

public class MethodReferanceExample2 {

	public static void main(String[] args) {
		List<Person> people = ObjectsUtils.getPersions();

		
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
