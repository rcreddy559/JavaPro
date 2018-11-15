package com.emc.java8.lambda;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import com.org.utils.ObjectsUtils;
import com.org.utils.Person;

public class ExerciseSolutionJava8 {

	public static void main(String[] args) {
		List<Person> people = ObjectsUtils.getPersions();
		
		Collections.sort(people, (o1, o2) ->  o1.getFirstName().compareTo(o2.getFirstName()));
		
		System.out.println("--------printAll-------");
		printAllCondition(people, p -> true);
		
		System.out.println("--------printAllWithNameBegin-------");
		printAllCondition(people, (p) -> p.getLastName().startsWith("c"));
		
		System.out.println("--------printAll age morethan 30 years -------");
		printAllCondition(people,  p -> p.getAge() > 30);
	}

	private static void printAllCondition(List<Person> people, Predicate<Person> predicate ) {
		for(Person p: people) {
			if(predicate.test(p))
			System.out.println(p.toString());
		}
	}

}
