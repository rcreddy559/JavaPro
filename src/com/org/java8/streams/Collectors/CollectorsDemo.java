package com.org.java8.streams.Collectors;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.emc.utils.Item;
import com.emc.utils.ObjectsUtils;

public class CollectorsDemo {

	public static void main(String[] args) {
		demo4();
	}

	private static Map<String, Long> demo1() {
		List<String> items = Arrays.asList("apple", "apple", "banana", "apple", "orange", "banana", "papaya");

		Map<String, Long> itemsMap = items.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(itemsMap);
		return itemsMap;

	}

	private static void demo2() {
		Map<String, Long> itemsMap = demo1();

		Map<String, Long> itemsLMap = new LinkedHashMap<>();

		itemsMap.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
				.forEachOrdered(e -> itemsLMap.put(e.getKey(), e.getValue()));
		System.out.println(itemsLMap);

	}

	private static void demo3() {
		Map<Integer, String> dataMap = ObjectsUtils.getDummyMapRamdom();
		Map<Integer, String> sortedDataMap = new LinkedHashMap<>();
		System.out.println(dataMap);

		dataMap.entrySet().stream().sorted(Map.Entry.<Integer, String>comparingByKey().reversed())
				.forEachOrdered(e -> sortedDataMap.put(e.getKey(), e.getValue()));
		System.out.println(sortedDataMap);

	}

	private static void demo4() {
		List<Item> items = ObjectsUtils.getItems();
		Map<String, Long> counting = items.stream()
				.collect(Collectors.groupingBy(Item::getName, Collectors.counting()));
		System.out.println(counting);
	}
}
