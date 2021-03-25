package com.org.java8.defaultmethods;

import javax.swing.*;

interface DemoDefaultMethods {

	void print();
	static void showStatic() {
		System.out.println(" showStatic is static method in interface!");
	}
	default void showMe() {
		System.out.println(" showMe is default method in Interface!");
	}
}
 
 interface DemoDefaultMethods2 {

	void print();
	default void showMe() {
		System.out.println(" showMe is default method in Interface!");
	}
}
 
  interface MyDemoDefaultMethod extends DemoDefaultMethods2, DemoDefaultMethods {

	@Override
	default void showMe() {
		DemoDefaultMethods2.super.showMe();
	}
	 
 }

 class MyDemoDefault implements DemoDefaultMethods, DemoDefaultMethods2 {


	 @Override
	 public void print() {

	 }

	 @Override
	 public void showMe() {
		 DemoDefaultMethods.super.showMe();
	 }
 }

public class DemoDefaultImpl implements DemoDefaultMethods {

	public static void main(String[] args) {
		DemoDefaultImpl ddi = new DemoDefaultImpl();
		ddi.showMe();
		DemoDefaultMethods.showStatic();
	}

	@Override
	public void print() {
		
	}

}
