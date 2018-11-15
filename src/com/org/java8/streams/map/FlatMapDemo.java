package com.org.java8.streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.org.utils.ObjectsUtils;

public class FlatMapDemo {

	public static void main(String[] args) {
		
		demo1();
	}
	
	private static void arrayDemo() {
		String[][] data = ObjectsUtils.getDoubleArray();
		
		
		Stream<String[]> dataStream = Arrays.stream(data);
		//dataStream.forEach(innerData->System.out.print(innerData[0]+", "+innerData[1]+" ; "));
		System.out.println();
		List<String[]> filterData = dataStream.filter(new Predicate<String[]>(){
			@Override
			public boolean test(String[] t) {
				
				return t[0] == "o";
			}
		}).collect(Collectors.toList());
		
		filterData.forEach(s->System.out.print(s[0]+", "));
		
	}
	
	private static void demo1() {
		String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

        //Stream<String[]>
        Stream<String[]> temp = Arrays.stream(data);
        
        //filter a stream of string[], and return a string[]?
        Stream<String[]> stream = temp.filter(x -> "a".equals(x.toString()));

        stream.forEach(System.out::println);

	}
	
	  
}
