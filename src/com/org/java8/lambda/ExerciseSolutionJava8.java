package com.org.java8.lambda;

import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import com.org.utils.*;

import com.org.utils.ObjectsUtils;

public class ExerciseSolutionJava8 {

	public static void main(String[] args) {
		List<com.org.utils.Person> people = ObjectsUtils.getPersions();
		
		Collections.sort(people, (o1, o2) ->  o1.getFirstName().compareTo(o2.getFirstName()));
		
		System.out.println("--------printAll-------");
//		printAllCondition(people, p -> true);
		
		System.out.println("--------printAllWithNameBegin-------");
//		printAllCondition(people, (p) -> p.getLastName().startsWith("c"));
		
		System.out.println("--------printAll age morethan 30 years -------");
		//printAllCondition(people,  p -> p.getAge() > 30);
	}

	private static void printAllCondition(List<Person> people, Predicate<Person> predicate ) {
		for(Person p: people) {
			if(predicate.test(p))
			System.out.println(p.toString());
		}
	}

}
