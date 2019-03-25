package com.org.java8.forEach;

import java.util.HashMap;
import java.util.Map;

import com.org.utils.ObjectsUtils;

public class ForEarchDemo {

	private static void demo1() {
	
		HashMap<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);

		map.forEach((k,v)->System.out.println(k+","+v));
	}
	static void demoOnForEarchMap() {
		
		
		

	}
	
	public static void main(String[] args) {
		demo1();
	}
}
