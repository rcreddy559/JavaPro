package com.org.java8.BuiltInFunctionalInterface;

import java.util.function.Supplier;

import com.org.utils.Car;

public class SupplierDemo {

	public static void main(String[] args) {
		Supplier<Car> fordCarProvider = ()->new Car("Ford", 1500, 4, 43000);
		Supplier<Car> bmwCarProvider = ()->new Car("Ford", 1500, 4, 43000);
		
		System.out.println(fordCarProvider.get().toString());
		System.out.println(bmwCarProvider.get().toString());
	}
}
