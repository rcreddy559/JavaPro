package com.org.java8.methodreferance;

public class MethodReferanceExample {

	Berlin berlin;

	public MethodReferanceExample(Berlin berlin) {
		this.berlin = berlin;
	}

	public static void main(String[] args) {
//		MethodReferanceExample me = 
		// Thread newThread = new Thread(()-> printMessage()); or
		Thread newThread = new Thread(MethodReferanceExample::printMessage);
		newThread.start();

	}

	static void printMessage() {
		System.out.println("Hello lambda thread");
	}

}

@FunctionalInterface
interface Germany {
	void printName();
}

class Berlin implements Germany {

	Berlin() {
	}

	@Override
	public void printName() {
		System.out.println("My name is Berlin");
	}
}
