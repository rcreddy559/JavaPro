package com.org.sorting;

import java.util.Arrays;

public class SelectionSortDemo {

	public static void main(String[] args) {
		int arr[] = { 64, 25, 12, 22, 11 };
		selectionSort(arr);
	}

	static void selectionSort(int[] arr) {
		System.out.println(Arrays.toString(arr));
		int n = arr.length;

		for (int i = 0; i < arr.length; i++) {

			int min_idx = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;

		}

		System.out.println(Arrays.toString(arr));
	}
}
