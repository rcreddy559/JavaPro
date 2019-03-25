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
		listOfPersions.add(new Person("Forrest", "Rhona", 1, "M", "9877336621"));
		listOfPersions.add(new Person("Anjelica", "Oren", 2, "F", "9877336622"));
		listOfPersions.add(new Person("Bob", "Quintin", 3, "M", "9877336623"));
		listOfPersions.add(new Person("Ula", "Hugo", 4, "F", "9877336624"));
		listOfPersions.add(new Person("An", "Reiko", 5, "M", "9877336625"));
		listOfPersions.add(new Person("Idell", "Brigida", 6, "F", "9877336626"));
		listOfPersions.add(new Person("Otha", "Gwendolyn", 7, "M", "9877336627"));
		listOfPersions.add(new Person("Tammy", "Gerard", 8, "F", "9877336628"));
		listOfPersions.add(new Person("Georgianna", "Berna", 9, "M", "9877336629"));
		listOfPersions.add(new Person("Jenise", "Brande", 10, "F", "9877336630"));
		listOfPersions.add(new Person("Chi", "Lavada", 11, "M", "9877336631"));
		listOfPersions.add(new Person("Philip", "Lisha", 12, "F", "9877336632"));
		listOfPersions.add(new Person("Lincoln", "Tessie", 13, "M", "9877336633"));
		listOfPersions.add(new Person("Velvet", "Kenia", 14, "F", "9877336634"));
		listOfPersions.add(new Person("Gertha", "Demetrius", 15, "M", "9877336635"));
		listOfPersions.add(new Person("Tameika", "Cristobal", 16, "F", "9877336636"));
		listOfPersions.add(new Person("Brandee", "Darrell", 17, "M", "9877336637"));
		listOfPersions.add(new Person("Lera", "Suk", 18, "F", "9877336638"));
		listOfPersions.add(new Person("Maryland", "Glenn", 19, "M", "9877336639"));
		listOfPersions.add(new Person("Ivey", "Helen", 20, "F", "9877336640"));
		listOfPersions.add(new Person("Dewayne", "Mandy", 21, "M", "9877336641"));
		listOfPersions.add(new Person("Fidela", "Philomena", 22, "F", "9877336642"));
		listOfPersions.add(new Person("Lynette", "Coy", 23, "M", "9877336643"));
		listOfPersions.add(new Person("Gloria", "Zora", 24, "F", "9877336644"));
		listOfPersions.add(new Person("Ingrid", "Lissette", 25, "M", "9877336645"));
		listOfPersions.add(new Person("Teresita", "Stephani", 26, "F", "9877336646"));
		listOfPersions.add(new Person("Annelle", "Josiah", 27, "M", "9877336647"));
		listOfPersions.add(new Person("Tyrell", "January", 28, "F", "9877336648"));
		listOfPersions.add(new Person("Anh", "Blossom", 29, "M", "9877336649"));
		listOfPersions.add(new Person("Clarita", "Antonio", 30, "F", "9877336650"));
		listOfPersions.add(new Person("Yukiko", "Illa", 31, "M", "9877336651"));
		listOfPersions.add(new Person("Avis", "Marline", 32, "F", "9877336652"));
		listOfPersions.add(new Person("Khalilah", "Jillian", 33, "M", "9877336653"));
		listOfPersions.add(new Person("Anitra", "Terrie", 34, "M", "9877336654"));
		listOfPersions.add(new Person("Tiffaney", "Keenan", 35, "F", "9877336655"));
		listOfPersions.add(new Person("Stephanie", "Nichol", 36, "M", "9877336656"));
		listOfPersions.add(new Person("Vernetta", "Vada", 37, "M", "9877336657"));
		listOfPersions.add(new Person("Wiley", "Inger", 38, "F", "9877336658"));
		listOfPersions.add(new Person("Clifford", "Wilford", 39, "M", "9877336659"));
		listOfPersions.add(new Person("Kasie", "Allene", 40, "M", "9877336660"));
		listOfPersions.add(new Person("Makeda", "Sudie", 41, "F", "9877336661"));
		listOfPersions.add(new Person("Bethanie", "Debbi", 42, "M", "9877336662"));
		listOfPersions.add(new Person("Hazel", "Un", 43, "M", "9877336663"));
		listOfPersions.add(new Person("Corine", "Nevada", 44, "F", "9877336664"));
		listOfPersions.add(new Person("Tonie", "Patria", 45, "M", "9877336665"));
		listOfPersions.add(new Person("Christal", "Akiko", 46, "M", "9877336666"));
		listOfPersions.add(new Person("Euna", "Shirl", 47, "F", "9877336667"));
		listOfPersions.add(new Person("Ozell", "Elena", 48, "M", "9877336668"));
		listOfPersions.add(new Person("Christia", "Danielle", 49, "M", "9877336669"));
		listOfPersions.add(new Person("Arron", "Kyla", 50, "F", "9877336670"));
		return listOfPersions;
	}

	public static List<Employee> getEmployees() {
		List<Employee> empList = new ArrayList<>();
		for (int i = 50; i > 0; i--) {
			int age = random.nextInt(50);
			empList.add(new Employee(i, age, age % 2 == 0 ? "Male" : "Femal", "Firest Name" + age, age + "last Name"));
		}
		empList.add(new Employee(100, 5, "Femal", "Divija", "Reddy"));
		empList.add(new Employee(101, 5, "Femal", "Divija", "Penumuru"));
		empList.add(new Employee(102, 5, "Femal", "Divija", "p"));
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

	public static List<String> getListOfString() {
		List<String> listOfString = Arrays.asList("Arabic Names", "Breton Names", "Cosy Celtic ", "Cool Celtic",
				"Clunky Celtic", "Cornish Names", "French Names", "Manx Names ", "Polish Names",
				"Scandinavian Familiars", "Scandinavian Particulars", "Scandinavian Spectaculars", "Vibrant Russian",
				"Diminutive Names", "Dulcet Dainties", "Funky Clunky", "Gothic Victoriana", "Guys and Dolls",
				"Latinate Lovelies", "Lively Lads", "Long Lost Rarities", "Modern Antiquity", "Multi-Syllabic",
				"Popular Biblical ", "Quirky Biblical", "Ripe Renovations", "Saintly and Stylish", "Short and Sweet ",
				"Slickly Continental", "Slim Softies", "Upright Elegance", "Vintage", "Adoni", "Amaravati", "Anantapur",
				"Chandragiri", "Chittoor", "Dowlaiswaram", "Eluru", "Guntur", "Kadapa", "Kakinada", "Kurnool",
				"Machilipatnam", "Nagarjunakoṇḍa", "Rajahmundry", "Srikakulam", "Tirupati", "Vijayawada",
				"Visakhapatnam", "Vizianagaram", "Yemmiganur");
		return listOfString;
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
