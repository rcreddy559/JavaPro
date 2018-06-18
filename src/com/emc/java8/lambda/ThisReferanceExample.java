package com.emc.java8.lambda;

public class ThisReferanceExample {

	public static void main(String[] args) {
		ThisReferanceExample thisReferanceExample = new ThisReferanceExample();
		thisReferanceExample.doProcess((i)-> {
			System.out.println(i);
//			System.out.println(this);
		});
		thisReferanceExample.execute();
	}

	void doProcess(Person p) {
		p.process(10);
	}
	
	void execute() {
		doProcess((i)-> {
			System.out.println(i);
			System.out.println(this);
		});
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "super class";
	}
}
