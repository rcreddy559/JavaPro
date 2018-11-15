package com.org.utils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class ObjectsUtils {

	static Random random = new Random();

	public static List<Person> getPersions() {

		List<Person> listOfPersions = new ArrayList<>(20);
		listOfPersions.add(new Person("Mark ","Zuckerberg", 33, "M",00));
		listOfPersions.add(new Person("Bill ","Gates", 62, "M",33));
		listOfPersions.add(new Person("Marissa ","Mayer", 42, "F",333));
		listOfPersions.add(new Person("Satya ","Nadella", 50, "M",44));
		listOfPersions.add(new Person("Sundar"," Pichai", 45, "M",555));
		listOfPersions.add(new Person("Sergey"," Brin", 44, "M",666));
		listOfPersions.add(new Person("Larry"," Page", 45, "M",777));

		return listOfPersions;
	}

	public static List<Employee> getEmployees() {
		List<Employee> empList = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			int age = random.nextInt(50);
			empList.add(new Employee(i, age, age % 2 == 0 ? "Male" : "Femal", "Firest Name" + age, age + "last Name"));
		}
		return empList;
	}

	public static Map<Integer, String> getDummyMap() {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "linode.com");
		map.put(2, "heroku.com");
		map.put(3, "digitalocean.com");
		map.put(4, "aws.amazon.com");
		return map;
	}

	public static Map<Integer, String> getDummyMapRamdom() {
		Map<Integer, String> map = new Hashtable<>();
		for (int i = 0; i < 50; i++) {
			map.put(random.nextInt(50), " dummy map ");
		}
		return map;
	}

	public static List<Integer> getListOfIntegers() {
		List<Integer> listOfIntegers = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			listOfIntegers.add(random.nextInt(50));
		}

		return listOfIntegers;
	}

	public static String[][] getDoubleArray() {
		String[][] data = new String[][] { { "q", "w" }, { "e", "r" }, { "t", "y" }, { "u", "i" }, { "o", "p" },
				{ "a", "s" }, { "d", "f" }, { "g", "h" }, { "j", "k" }, { "l", "z" }, { "z", "x" }, { "c", "v" },
				{ "b", "n" }, { "m", "i" }, { "o", "p" } };

		return data;
	}

	public static List<Item> getItems() {
		List<Item> items = Arrays.asList(new Item("apple", 10, new BigDecimal("9.99")),
				new Item("banana", 20, new BigDecimal("19.99")), new Item("orang", 10, new BigDecimal("29.99")),
				new Item("watermelon", 10, new BigDecimal("29.99")), new Item("papaya", 20, new BigDecimal("9.99")),
				new Item("apple", 10, new BigDecimal("9.99")), new Item("banana", 10, new BigDecimal("19.99")),
				new Item("apple", 20, new BigDecimal("9.99")));

		return items;
	}
	
	 

	public static void main(String[] args) {
		getListOfIntegers().forEach(i -> System.out.println(i));
	}
}
