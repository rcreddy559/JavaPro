package com.org.hackerrank.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingArray {

	public static void main(String[] args) {
		/*
		 * You are given an array of length n you have to sort the array element in
		 * descending order of their frequency. Use of Collections not allowed input:
		 * [4,3,1,6,4,3,6,4] output: [4,4,4,3,3,6,6,1]
		 */
//		int[] array = { 9, 9, 4, 3, 9, 1, 6, 4, 3, 9, 6, 4, 9 };
//		for (int i : array) {
//			System.out.print(i + ",");
//		}
//		System.out.println();
//		sortArray(array);
//		removeDuplicates(array);
//		removeDuplicates(new int[] { 4, 3, 2, 4, 9, 2 });
//
//		removeDuplicates(new int[] { 1, 2, 1, 2, 1, 2 });
//
//		removeDuplicates(new int[] { 15, 21, 11, 21, 51, 21, 11 });
//
//		removeDuplicates(new int[] { 7, 3, 21, 7, 34, 18, 3, 21 });

		sortCom();
	}

	public static int[] sort(int[] array) {
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < i; j++) {
				int temp;
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}

		}
		printArray(array);
		System.out.println();
		return array;
	}

	public static void sortCom() {
		List<Integer> list = Arrays.asList(10, 1, 20, 11, 21, 12);
		Comparator<Integer> cmp = new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return Integer.valueOf(o2).compareTo(Integer.valueOf(o1));
			}
		};
		Collections.sort(list, cmp);
		//return list.get(list.size()-10);
		System.out.println(list);
	}

	private static void sortArray(int[] array) {
		int[] sortedArray = sort(array);
		int[][] array2D = new int[sortedArray.length][2];
		int count = 0;
		array2D[count][0] = sortedArray[0];
		array2D[count][1] = 1;
		for (int i = 1; i < sortedArray.length; i++) {
			if (sortedArray[i] == sortedArray[i - 1]) {
				array2D[count][1] = array2D[count][1] + 1;
			} else {
				count++;
				array2D[count][0] = sortedArray[i];
				array2D[count][1] = 1;
			}
		}

		printArray2D(array2D);
	}

	public static void printArray(int[] array) {

		for (int i : array) {
			System.out.print(i + ",");
		}
	}

	public static void printArray2D(int[][] array) {
		for (int[] ints : array) {
			System.out.println(ints[0] + "," + ints[1]);
		}
	}

	static void removeDuplicates(int[] arrayWithDuplicates) {
		System.out.println("Array With Duplicates : ");

		for (int arrayWithDuplicate : arrayWithDuplicates) {
			System.out.print(arrayWithDuplicate + "\t");
		}

		// Assuming all elements in input array are unique
		int noOfUniqueElements = arrayWithDuplicates.length;
		// Comparing each element with all other elements

		for (int i = 0; i < noOfUniqueElements; i++) {
			for (int j = i + 1; j < noOfUniqueElements; j++) {
				// If any two elements are found equal
				if (arrayWithDuplicates[i] == arrayWithDuplicates[j]) {
					// Replace duplicate element with last unique element
					arrayWithDuplicates[j] = arrayWithDuplicates[noOfUniqueElements - 1];
					// Decrementing noOfUniqueElements
					noOfUniqueElements--;
					// Decrementing j

					j--;
				}
			}
		}

		// Copying only unique elements of arrayWithDuplicates into
		// arrayWithoutDuplicates

		int[] arrayWithoutDuplicates = Arrays.copyOf(arrayWithDuplicates, noOfUniqueElements);

		// Printing arrayWithoutDuplicates

		System.out.println("Array Without Duplicates : ");
		for (int arrayWithoutDuplicate : arrayWithoutDuplicates) {
			System.out.print(arrayWithoutDuplicate + "\t");
		}
	}

}
