package com.org.java8.Boxed;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BoxedDemo {

	public static void main(String[] args) {
		demo1();
	}

	private static void demo1() {
		List<String> list = Stream.of("how", "to", "do", "in", "java").collect(Collectors.toList());
		List<Integer> inList = IntStream.of(1, 2, 8, 4, 7, 90, 3, 1, 60, 3, 6).boxed().collect(Collectors.toList());

		Optional<Integer> inListBoxed = IntStream.of(101, 2, 8, 4, 7, 90, 3, 1, 60, 3, 6).boxed()
				.max(Integer::compareTo);
		System.out.println(inListBoxed.get());
	}

}
