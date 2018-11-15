package com.org.java8.streams;

import java.util.Arrays;
import java.util.List;

import com.emc.utils.ObjectsUtils;
import com.emc.utils.Person;

public class StreamsLambdaExample {

	public static void main(String[] args) {
		List<Person> people = ObjectsUtils.getPersions();
		people.stream().filter(p->p.getFirstName().startsWith("J"))
		.forEach(System.out::println);

	}

}
