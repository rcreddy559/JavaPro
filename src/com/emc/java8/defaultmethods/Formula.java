package com.emc.java8.defaultmethods;

public class Formula implements FormulaCalc {
	public double calculate(int a) {
		return sqrt(a);
	}
	
	public static void main(String[] args) {
		Formula f = new Formula();
		System.out.println(f.calculate(2));
	}
}

interface FormulaCalc {

	double calculate(int a);

	default double sqrt(int a) {
		return Math.sqrt(a);
	}
}
