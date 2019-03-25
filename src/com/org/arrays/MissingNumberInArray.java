package com.org.arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int n = 10;
		int expectedSum = 0;
		int[] intArray = new int[n];
		for (int i = 0; i < n; i++) {
			intArray[i] = i + 1;
			expectedSum += i + 1;
		}

		System.out.println("Expected sume:" + expectedSum);
		System.out.println(intArray);

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println(expectedSum - sum);
		System.out.println();

	}
}
