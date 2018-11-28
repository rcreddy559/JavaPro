package com.org.search;

public class LinearSearch {

	public static void main(String[] args) {
		int[] array = { 55, 77, 99, 22, 11, 6, 7, 8, 0, 3 };
		int x = 6;
		int index = linerSearch(array, x);
		System.out.println(index);
	}

	static int linerSearch(int[] array, int x) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == x) {
				return i;
			}
		}
		return -1;
	}

}
