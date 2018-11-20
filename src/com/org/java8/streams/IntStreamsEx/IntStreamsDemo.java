package com.org.java8.streams.IntStreamsEx;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.swing.text.html.parser.Entity;

public class IntStreamsDemo {

	public static void main(String[] args) {
		System.out.println(Function.identity());
		funMap();

	}
	
	private static void fun1() {
		IntStream.of(1,2,3,4,5).forEach(System.out::println);
	}

	private static void fun2() {
		//IntStream.range(1,5).forEach(System.out::println);
		IntStream.rangeClosed(1,5).forEach(System.out::println);
	}
	
	private static void fun3() {
		
		IntStream.iterate(1,i->funS(i)).limit(10).forEach(System.out::println);
	}
	
	static int funS(int i) {
		return i*10;
	}
	
	static void funMap() {
		int[] arr = {2,4,5,6,1,0};
		Map<Integer, Integer> map = IntStream.range(0,  arr.length).boxed().
		collect(Collectors.toMap(i->arr[i], Function.identity()));
		
		for(Map.Entry<Integer, Integer> m: map.entrySet()) {
			System.out.printf("%d, %d\n", m.getKey(), m.getValue());
		}
	}
}
