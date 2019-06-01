package com.org.hackerrank;

public class OutputFormatting {

	public static void main(String[] args) {
		demo1();
	}

	private static void demo1() {
		int N = 2;
		for (int i = 1; i <= 10; i++) {
			int r = N * i;
			System.out.printf("%d X %d = %d%n", N, i, r);
		}
	}
}
