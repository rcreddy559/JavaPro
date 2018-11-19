package com.org.java8.FunctionalInterface;

public class Person {

	String firstName;
	String lastName;
	Person(){}
	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public static void main(String[] args) {
		PersonFactory<Person> pf = Person::new;
		Person p = pf.create("Ravi", "chandra");
		
	}
	
}

interface PersonFactory<P extends Person> {
	P create(String firstName, String lastName);
}
