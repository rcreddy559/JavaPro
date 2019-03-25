package com.org.java8.lambda;

public class ClosuresExample {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		doProcess(a, i -> System.out.println(i + b));
		System.out.println("normal calling");

		Person person = new PersonImpl();
		doProcess(a, person);
	}

	static void doProcess(int a, Person person) {
		person.process(a);
	}
}

interface Person {
	void process(int i);
}

class PersonImpl implements Person {
	@Override
	public void process(int i) {
		System.out.println(i);
	}
}