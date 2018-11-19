package com.org.java8.BuiltInFunctionalInterface;

import java.util.List;
import java.util.function.Predicate;

import com.org.utils.ObjectsUtils;
import com.org.utils.Person;

public class PredicateDemo {

	public static void main(String[] args) {
		new PredicateDemo().demo3();
	}

	private void demo() {
		List<Person> personList = ObjectsUtils.getPersions();

		Predicate<Person> personPredicate = (p) -> p.getAge() < 30;
		personList.forEach((p) -> {
			System.out.println(personPredicate.test(p));
		});

	}

	private void demo1() {
		Predicate<Integer> preInt = i -> i < 20;
		System.out.println(preInt.test(100));
		
	}
	
	private void demo2() {
		Predicate<Integer> greaterThanTen = (i) -> i > 10; 
		  
        // Creating predicate 
        Predicate<Integer> lowerThanTwenty = (i) -> i < 20;  
        
        boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
        System.out.println(result);
	}
	
	private void demo3() {
		List<Integer> list = ObjectsUtils.getListOfIntegers();
		
		list.forEach(System.out::println);
		System.out.println("-----------");
		list.removeIf(i->i>8);
		list.forEach(System.out::println);

	}
}
