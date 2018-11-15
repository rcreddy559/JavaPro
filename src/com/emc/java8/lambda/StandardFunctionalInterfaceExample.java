package com.emc.java8.lambda;

import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.emc.utils.ObjectsUtils;
import com.emc.utils.Person;

public class StandardFunctionalInterfaceExample {

	public static void main(String[] args) {
		List<Person> people = ObjectsUtils.getPersions();
		
		Collections.sort(people, (o1, o2) ->  o1.getFirstName().compareTo(o2.getFirstName()));
		
		System.out.println("--------printAll-------");
		performAllCondition(people, p -> true, p->System.out.println(p.toString()));
		
		System.out.println("--------printAllWithNameBegin-------");
		performAllCondition(people, (p) -> p.getLastName().startsWith("c"),  p->System.out.println(p.toString()));
		
		System.out.println("--------printAll age morethan 30 years -------");
		performAllCondition(people,  p -> p.getAge() > 30,  p->System.out.println(p.toString()));
	}

	private static void performAllCondition(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person p: people) {
			if(predicate.test(p))
			consumer.accept(p);
		}
	}

}
