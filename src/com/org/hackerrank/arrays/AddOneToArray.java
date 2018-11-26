package com.org.hackerrank.arrays;

import java.util.Arrays;

public class AddOneToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] givenArray = { 9, 9, 9, 9 };
		addOne(givenArray);
	}

	private static void addOne(int[] givenArray) {
		int carry = 1;
		int total = 0;
		int[] result = new int[givenArray.length];
		for (int i = givenArray.length - 1; i >= 0; i--) {
			total = givenArray[i] + carry;
			if (total == 10)
				carry = 1;
			else
				carry = 0;
			result[i] = total % 10;

			if (carry == 1) {
				result = new int[givenArray.length + 1];
				result[0] = 1;
			}
		}
		System.out.println(Arrays.toString(result));

	}

}
