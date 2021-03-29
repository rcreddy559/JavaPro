package com.org.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		demo1();
		System.out.println("-----------------------");
		demo2();

	}

	// Optimized Bubble sort
	private static void demo2() {
		int[] arr = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		System.out.println(Arrays.toString(arr));
		int temp;
		int n = arr.length;
		boolean swapped = false;
		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					// swap arr[j] and arr[j+1]
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}

		}
		System.out.println(Arrays.toString(arr));

	}

	// Normal Bubble sort
	static void demo1() {
		int[] arr = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		System.out.println(Arrays.toString(arr));
		int temp;
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 1; j < (n - i) - 1; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));
	}
}
