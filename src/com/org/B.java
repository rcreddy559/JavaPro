package com.org;

public class B extends A {

	public void getDetails() {
		System.out.println("this is private method");
	}
	
	public static void main(String[] args) {
		A a = new B();
		a.getDetails();
	}
}
