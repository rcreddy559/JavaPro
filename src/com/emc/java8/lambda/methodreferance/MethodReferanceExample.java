package com.emc.java8.lambda.methodreferance;

public class MethodReferanceExample {

	public static void main(String[] args) {
//		Thread newThread =  new Thread(()-> printMessage()); or 
		Thread newThread =  new Thread(MethodReferanceExample::printMessage);
		newThread.start();

	}
	
	static void printMessage(){
		System.out.println("Hello lambda thread");
	}

}
