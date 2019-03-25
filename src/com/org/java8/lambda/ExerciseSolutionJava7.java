package com.org.java8.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.org.utils.Person;

import com.org.utils.ObjectsUtils;

public class ExerciseSolutionJava7 {

	public static void main(String[] args) {
		List<Person> people = ObjectsUtils.getPersions();

		Collections.sort(people, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
		});

		System.out.println("--------printAll-------");
		printAll(people);

		System.out.println("--------printAllWithNameBegin-------");
		printAllCondition(people, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("c");
			}
		});

		System.out.println("--------printAll age morethan 30 years -------");
		printAllCondition(people, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getAge() > 30;
			}
		});
	}

	private static void printAllCondition(List<Person> people, Condition conditon) {
		for (Person p : people) {
			if (conditon.test(p))
				System.out.println(p.toString());
		}

	}

	private static void printAll(List<Person> people) {
		for (Person p : people) {
			System.out.println(p.toString());
		}

	}

}

interface Condition {
	boolean test(Person p);
}