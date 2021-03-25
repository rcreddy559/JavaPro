package com.org.hackerrank.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AllArrayPros {
	
	public static void main(String[] args) {
//		findDuplicates();

//		System.out.println(isPrimeNumber(100));
//		IntStream.range(1, 100).forEach(value-> {
//			if(isPrimeNumber(value))
//				System.out.println(value);
//		});

//		System.out.println(findFactorial(4));
		findFibonacci(10);
	}


	int[] array1 = {1,2,3,4,6};
    
    
	public static void findMissingNumber(int[] newArray){

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
			unique.add(i);
		}
		
		System.out.println(unique.toString());

	}
	private static boolean isPrimeNumber(int value) {
	 	if(value == 0 || value == 1)
	 		 return false;

	 	for(int i =2;i<value/2;i++) {
	 		if(value % i ==0)
	 			return false;
		}
	 	return true;
	}

	static int findFactorial(int value) {
		if(value == 0)
			return 1;
		return (value*findFactorial(value-1));
	}

	static void findFibonacci(int value) {
		int v1 = 0,v2 = 1,v3;
		System.out.print(v1+" "+v2+" ");
		for(int i=2;i<value;i++) {
			v3 = v1+v2;
			System.out.print(v3+" ");
			v1 = v2;
			v2 = v3;
		}
	}
}
