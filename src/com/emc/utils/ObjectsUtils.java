package com.emc.utils;

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
		listOfPersions.add(new Person("Ravi", "Chandra", 37));
		listOfPersions.add(new Person("shobha", "penumuru", 33));
		listOfPersions.add(new Person("Divija", "reddy", 5));
		listOfPersions.add(new Person("Jagan", "mohan", 66));
		listOfPersions.add(new Person("cccccc", "vvvvvvvvv", 44));
		listOfPersions.add(new Person("bbbbbbbb", "nnn", 22));
		listOfPersions.add(new Person("mmm", "zzz", 56));
		listOfPersions.add(new Person("xx", "Chandra", 88));
		listOfPersions.add(new Person("aaa", "ddddddd", 77));
		listOfPersions.add(new Person("ggggggg", "hhhhhh", 55));
		listOfPersions.add(new Person("kkkkkkk", "jjjjjjj", 31));
		listOfPersions.add(new Person("www", "eeeeeee", 33));
		listOfPersions.add(new Person("rrrrrrr", "ttttt", 34));
		listOfPersions.add(new Person("uuuuuu", "iiiiiiiii", 57));
		listOfPersions.add(new Person("oooo", "pppppppp", 43));
		listOfPersions.add(new Person("dddddd", "cccccccc", 27));
		listOfPersions.add(new Person("fffff", "gggg", 17));
		listOfPersions.add(new Person("xcxcx", "vbvb", 7));
		listOfPersions.add(new Person("dfdf", "asasa", 3));

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
