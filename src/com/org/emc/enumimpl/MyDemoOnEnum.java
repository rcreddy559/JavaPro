package com.org.emc.enumimpl;

public class MyDemoOnEnum {

	public static void main(String[] args) {

		for (WhoisRIR who : WhoisRIR.values()) {
			System.out.println(who + " : " + who.getUrl());
		}

		System.out.println("----------------");
		
		for (EnvEnum e : EnvEnum.values()) {
			System.out.println(e);
		}
		
		System.out.println("----------------");
		
		for(Operation o: Operation.values()) {
			System.out.println(o.calculate(20, 30));
		}

	}

}
