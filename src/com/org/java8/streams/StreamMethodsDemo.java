package com.org.java8.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMethodsDemo {
	public static void main(String[] args) {
		concatDemo();
	}
	
	private static void concatDemo() {
		IntStream intStream = IntStream.range(3, 8);
		Stream strStream = Stream.of("Geeks", "for", "Geeks");
		
//		Stream<Integer> stream = intStream.boxed();
		Stream<Object> objStream = Stream.concat(intStream.boxed(), 
							strStream);
		objStream.forEach(System.out::println);
		
	}
}
