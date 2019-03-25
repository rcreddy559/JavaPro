package com.org.java8.streams.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.org.utils.ObjectsUtils;

public class FilterString {

	public static void main(String[] args) {
		filterDemo();
	}
	
	
	

	static void filterDemo() {
		List<String> strList = ObjectsUtils.getListOfString();

		// Java 7
//		List<String> newList = myFilter(strList);

		// Java 8
		List<String> newList = strList.stream().filter(s -> s.length() == 5).collect(Collectors.toList());
		newList.forEach(s -> System.out.println(s));

	}

	private static List<String> myFilter(List<String> list) {
		List<String> filterList = new ArrayList<String>();

		for (String str : list) {
			if (str.length() == 5) {
				filterList.add(str);
			}
		}

		return filterList;

	}
}
