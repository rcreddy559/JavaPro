package com.org.java8.streams.filter;

import java.util.List;
import java.util.function.Predicate;

import com.org.utils.ObjectsUtils;
import com.org.utils.Person;

public class FilterByaAlMatch {

	public static void main(String[] args) {
		List<Person> persons = ObjectsUtils.getPersions();
		List<String> strList = ObjectsUtils.getListOfString();

//		findAllMatch("ravi", persons);
		findAllMatch(strList);
	}

	private static void findAllMatch(List<String> strList) {
		Predicate<String> predicate = s -> s.length() > 5;
		boolean matchStatus = strList.stream().anyMatch(predicate);
		System.out.println(matchStatus);
	}

	private static void findAllMatch(String string, List<Person> persons) {

	}

}
