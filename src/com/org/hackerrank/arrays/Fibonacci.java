package com.org.hackerrank.arrays;

/* 
 * Java program for Memoized and Tabulated version 
 * https://www.geeksforgeeks.org/overlapping-subproblems-property-in-dynamic-programming-dp-1/
 * */

public class Fibonacci {

	public static void main(String[] args) {
		int findFib = 10;
		Fibonacci fibonacci = new Fibonacci();
		fibonacci._initialize();

		int fib = fibonacci.fib(findFib);
		System.out.println(fib);
	}

	final int MAX = 100;
	final int NIL = -1;
	int[] lookup = new int[MAX];

	void _initialize() {
		for (int i = 0; i < MAX; i++) {
			lookup[i] = NIL;
		}
	}

	int fib(int n) {
		if (lookup[n] == NIL) {
			if (n <= 1) {
				lookup[n] = n;
			} else {
				lookup[n] = fib(n - 1) + fib(n - 2);
			}
		}
		return lookup[n];
	}

	int fibTabulated(int n) {
		int[] lookupT = new int[n + 1];
		lookupT[0] = 0;
		lookupT[1] = 1;

		for (int i = 2; i <= n; i++) {
			lookupT[i] = lookupT[i - 1] + lookupT[i - 2];
		}

		return lookupT[n];
	}
}
