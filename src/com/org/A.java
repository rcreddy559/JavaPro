package com.org;

import java.io.IOException;

public class A {

	protected int getDetails() {
		System.out.println("this is private method");

		try {
			throw new IOException();
		} catch (Exception e) {
			System.out.println("c");

			return 1;
		} finally {
			System.out.println("finally");
			return 2;
		}
	}

	public static void main(String[] args) {
//		System.out.println(new A().getDetails());
		
	}

}
