package com.emc.java8.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

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
		// TODO Auto-generated method stub

		DemoIter d = (i)-> {
			System.out.println("hello Labda expresson !!"+i);
		};
		d.show(101010);
		
	}

}
