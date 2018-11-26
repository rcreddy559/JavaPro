package com.org.utils;

import java.util.Arrays;

public class Fibonacci {

	public static void main(String[] args) {
		int finFib = 10;
		int feb = fibRecursion(finFib);
		feb = fibPro(finFib);
		System.out.println(feb);
	}

	private static int fibRecursion(int n) {
		if (n < 0)
			System.out.println("Incorrect input");

		if (n == 0)
			return 0;

		if (n == 1)
			return 1;

		return fibRecursion(n - 1) + fibRecursion(n - 2);
	}

	static int fib(int n) {
		int[] arr = new int[n + 2];

		arr[0] = 0;
		arr[1] = 1;

		for (int i = 2; i <= n; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		System.out.println(Arrays.toString(arr));
		return arr[n];
	}

	static int fibPro(int n) {
		int a = 0, b = 1, c = 0;
		if (n == 0)
			return a;
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}

		return b;
	}
}
