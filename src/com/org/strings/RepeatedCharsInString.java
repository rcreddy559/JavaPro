package com.org.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatedCharsInString {

	public static void main(String[] args) {
		String name = "This is java program to find out repeated chars in string";
		
		findRepeatedChars(name);

	}

	private static void findRepeatedChars(String name) {
		 char[] nameArray = name.toCharArray();
		 Map<Character, Integer> arrayMap = new HashMap<Character, Integer>(nameArray.length);
		 
		 for(char key: nameArray) {
			 if(arrayMap.containsKey(key)) {
				 arrayMap.put(key, arrayMap.get(key)+1);
			 } else {
				 arrayMap.put(key, 1);
			 }
		 }
		 Map<Character, Integer> repeatedCharsMap = arrayMap.entrySet()
		 .stream()
		 .filter(x->x.getValue() != 1)
		 .collect(Collectors.toMap(x->x.getKey(), x -> x.getValue()));
		 
		 /*for(Map.Entry<Character, Integer> map: repeatedCharsMap.entrySet()) {
			System.out.println(map.getKey()+" : "+map.getValue());
		 }*/
		 repeatedCharsMap.forEach((key,value)-> System.out.println(key+":"+value));
		 
		
	}

}
