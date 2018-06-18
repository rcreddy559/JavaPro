package com.emc.java8.streams;

import java.util.Arrays;
import java.util.List;

import com.emc.util.Person;

public class StreamsLambdaExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Ravi", "chandra", 36), 
				new Person("Shobha", "Penumuru", 31),
				new Person("Jagan", "Mohan", 41), 
				new Person("Jyothis", "penumuru", 8),
				new Person("Sohith", "Reddy", 6), 
				new Person("Divija", "chandra", 4));
		people.stream().filter(p->p.getFirstName().startsWith("J"))
		.forEach(System.out::println);

	}

}
