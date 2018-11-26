package com.org.hackerrank.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class AllArrayPros {
	
	public static void main(String[] args) {
		findDuplicates();
	}

	int[] array1 = {1,2,3,4,6};
    
    
	public static void findMissingNumber(int newArray[]){

        final int arrayLength = newArray.length+1;
        final int expectedTotal = (arrayLength*(arrayLength+1))/2;

        int count = 0;
        for(int a: newArray) {
            count += a;
        }
        final int missingNumber = expectedTotal - count;
        System.out.println(missingNumber);
    }
	
	private static void findRepeatedChars() {
		String name = "This is java program to find out repeated chars in string";
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
	
	private static void reverse() {
		int[] array = {10,2,3,4,5,99};
		System.out.println(Arrays.toString(array));
		int i = 0;
		int j = array.length-1;
		int temp;
		
		while(i<j) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}
		
		System.out.println(Arrays.toString(array));
		
	}
	
	private static void findDuplicates() {
		int[] withDuplicates = { 1, 2, 3, 1, 2, 3, 4, 5, 3, 6 }; 
		Set<Integer> unique = new HashSet<>();
		
		for(int i: withDuplicates) {
			if(!unique.contains(i)) {
				unique.add(i);
			}
		}
		
		System.out.println(unique.toString());

	}
	private boolean isPrimeNumber(int numebr1) {
		int number = 10;
		if(number ==2 || number == 3) {
			return true;
		}
//		if()
		
		return false;
	}
	
}
