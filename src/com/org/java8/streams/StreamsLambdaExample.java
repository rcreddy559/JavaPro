package com.org.java8.streams;

import java.util.List;

import com.org.utils.ObjectsUtils;
import com.org.utils.Person;

public class StreamsLambdaExample {

	public static void main(String[] args) {
		List<Person> people = ObjectsUtils.getPersions();
		people.stream().filter(p->p.getFirstName().startsWith("J"))
		.forEach(System.out::println);

	}

}
