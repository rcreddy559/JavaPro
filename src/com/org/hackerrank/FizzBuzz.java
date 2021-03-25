package com.org.hackerrank;

import java.util.stream.IntStream;

public class FizzBuzz {

	public static void main(String[] args) {
		final int range = 100;
//		pringFizzBuzz(range);
		pringFizzBuzzJava8(range);

	}

	private static void pringFizzBuzzJava8(int range) {
		IntStream.rangeClosed(1, range).forEach(i -> {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		});
	}

	private static void pringFizzBuzz(int range) {
		for (int i = 1; i <= range; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}

	}

}
