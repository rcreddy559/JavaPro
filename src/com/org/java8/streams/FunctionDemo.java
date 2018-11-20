package com.org.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<Double, Double> increase = n -> n + 1D;
		Function<Double, Double> doubleNumber = n -> n + 2;

		List<Double> list = Arrays.asList(10D, 40D, 2D);
//		demo(doubleNumber, list);
		demo3LongStream();

	}

	private static void demo(Function<Double, Double> function, List<Double> list) {
		List<Double> list2 = new ArrayList<>();
		for (Double d : list) {
			list2.add(function.apply(d));
		}

		for (Double d : list2) {
			System.out.println(d);
		}
	}

	private static void demo1() {
		List<String> list = Arrays.asList("3", "6", "8", "14", "15");

		// list.stream().mapToInt(n->Integer.parseInt(n)).filter(i->i>10).forEach(System.out::println);
		IntStream s = list.stream().mapToInt(n -> Integer.parseInt(n));
		Map<Object, Integer> m = s.boxed().collect(Collectors.toMap(i -> i, Function.identity()));

		for (Map.Entry<Object, Integer> e : m.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}
	
	private static void demo3LongStream() {
		LongStream longStream = LongStream.of(20,30,40,50,60);
		IntStream intStream = longStream.mapToInt(i->(int)i);
		intStream.forEach(System.out::println);
		
	}

}
