package com.emc.java8.lambda;

import java.util.function.BiConsumer;

public class ExceptonHandlingExample {

	public static void main(String[] args) {
		int[] myArray = {10,20,30,40,50,60,70,80,90};
		int key = 0;
		
		process(myArray, key, handleExeption((i, k) -> System.out.println(i/k)));

	}

	private static BiConsumer<Integer, Integer> handleExeption(BiConsumer<Integer, Integer> consumer) {
		
		return (v, k) -> {
			try {
			consumer.accept(v, k);
			} catch(Exception e) {
				System.out.println("exception ");
			}
			};
	}

	private static void process(int[] myArray, int key, BiConsumer<Integer, Integer> consumer) {
		for(int i: myArray) {
			consumer.accept(i, key);
		}
		
	}

}
