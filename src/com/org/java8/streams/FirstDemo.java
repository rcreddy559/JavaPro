package com.org.java8.streams;

import java.util.Arrays;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FirstDemo {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(20,30,40,50,60,70);
		System.out.println(myList);
		
		List<Integer> newList = myList.stream().filter(i->i<50).collect(Collectors.toList());
		System.out.println(newList);
		
		List<Integer> mapList = myList.stream().map(i->i*10).collect(Collectors.toList());
		System.out.println(mapList);
		
		int findFirst = myList.stream().findFirst().get();
		System.out.println(findFirst);
	}
}
