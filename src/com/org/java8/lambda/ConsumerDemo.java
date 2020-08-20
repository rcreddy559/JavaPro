package com.org.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsImpl implements Consumer<Integer> {
	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}
}

public class ConsumerDemo {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(20,30,40,50,60,70);
		ConsImpl c = new ConsImpl();
		myList.forEach(c);
		
		// 2
		ConsImpl c2 = new ConsImpl() {
			public void accept(Integer t) {
				System.out.println(t);
			}
        };
		myList.forEach(c2);
		
		// 2
		Consumer<Integer> c3 = (Integer t) -> {
				System.out.println(t);
			}; 
		Consumer<Integer> c4 = i-> System.out.println(i);
		
		
		myList.forEach(c3);
	}
}
