package com.org.arrays;

public class AllArryPros {
	public static void main(String[] args) {
		findDuplicates();
	}

	public static void findDuplicates() {
		int[] array = { 1, 2, 3, 4, 1, 3, 7, 5, 6, 1, 7, 8, 9 };
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					System.out.println(array[i] + "; - " + (j + 1));
				}
			}
		}

	}
}
