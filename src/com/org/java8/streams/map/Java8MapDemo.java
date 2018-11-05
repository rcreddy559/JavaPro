package com.org.java8.streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8MapDemo {

	public static void main(String[] args) {
		
		converUpperCase();
	}
	
	private static void converUpperCase() {
		List<String> names = Arrays.asList("ravi","divija","shobha", "Sarala","bhaskar", "jagan","jayasri");
		names.forEach(System.out::println);
		System.out.println("------------");
		names = names.stream()
		.map(new Function<String, String>() {
			@Override
			public String apply(String t) {
				return t.concat(" Reddy");
			}
		})
		.filter(new Predicate<String>() {
			public boolean test(String t) {
				return t.length() > 12;
			}; 
		}).collect(Collectors.toList());
		names.forEach(System.out::println);
	}
}
