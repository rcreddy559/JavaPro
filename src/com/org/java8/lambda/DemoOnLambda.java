package com.org.java8.lambda;

interface DemoIter {
	void show(int i);
}
class DemoImpl implements DemoIter {
	@Override
	public void show(int i ) {
		System.out.println("Lambda expresion "+i);
	}
}

public class DemoOnLambda {

	public static void main(String[] args) {

		DemoIter d = (i)-> {
			System.out.println("hello Labda expresson !!"+i);
		};
		d.show(101010);
		
	}

}
