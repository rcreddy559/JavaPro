package com.org.java8.defaultmethods;

 interface DemoDefaultMethods {

	public void print();
	default void showMe() {
		System.out.println(" showMe is default method in Interface!");
	}
}
 
 interface DemoDefaultMethods2 {

	public void print();
	default void showMe() {
		System.out.println(" showMe is default method in Interface!");
	}
}
 
  interface MyDemoDefaulMethod extends DemoDefaultMethods2, DemoDefaultMethods {

	@Override
	default void showMe() {
		// TODO Auto-generated method stub
		DemoDefaultMethods2.super.showMe();
	}
	 
 }

public class DemoDefaultImpl implements DemoDefaultMethods {

	public static void main(String[] args) {
		
		DemoDefaultImpl impl = new DemoDefaultImpl();
		impl.showMe();
	}

	@Override
	public void print() {
		
	}

}
