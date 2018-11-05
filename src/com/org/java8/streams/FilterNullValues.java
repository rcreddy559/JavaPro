package com.org.java8.streams;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterNullValues {

	public static void main(String[] args) {
		demo1();
	}
	private static void demo1() {
		Stream<String> language = Stream.of("java", "python", "node", null, "ruby", null, "php");
		language.forEach(s->{System.out.println(s);});
		language = Stream.of("java", "python", "node", null, "ruby", null, "php");
		
		List<String> list = language.filter(x->x!=null).collect(Collectors.toList());
		list.forEach(s->{System.out.print(s+", ");});
		
		System.out.println();
		
		language = Stream.of("java", "python", "node", null, "ruby", null, "php");
		List<String> list2 = language.filter(Objects::nonNull).collect(Collectors.toList());
		list2.forEach(s->{System.out.print(s+", ");});
		
	}
}
