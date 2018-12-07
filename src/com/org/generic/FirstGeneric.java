package com.org.generic;

public class FirstGeneric {

	public static void main(String[] args) {
		TwoGen<String, Integer> twoGen = new TwoGen<String, Integer>("name", 101010);
		twoGen.showTypes();

	}

}
