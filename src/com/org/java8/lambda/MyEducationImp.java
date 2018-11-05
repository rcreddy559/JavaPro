package com.org.java8.lambda;

public class MyEducationImp {

	public static void main(String[] args) {
		MyEducation education = () -> System.out.println(" this is get deatils");

		education.getLearnerDetails();
	}

}
