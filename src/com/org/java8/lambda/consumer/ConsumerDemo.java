package com.org.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	static class ConsImpl implements Consumer<Integer> {
		@Override
		public void accept(Integer t) {
			System.out.println(t);
		}
	}

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(20, 30, 40, 50, 60, 70);
		ConsImpl c = new ConsImpl();

		// 2
		ConsImpl c2 = new ConsImpl() {
			@Override
			public void accept(Integer t) {
				System.out.println("c2: " + t);
			}
		};

		// 3
		Consumer<Integer> c3 = (Integer t) -> {
			System.out.println("c3: " + t);
		};

		// 4
		Consumer<Integer> c4 = i -> System.out.println("c4: " + i);

		myList.forEach(c);
		System.out.println("------------------");
		myList.forEach(c2);
		System.out.println("------------------");
		myList.forEach(c3);
		System.out.println("------------------");
		myList.forEach(c4);
	}
}
