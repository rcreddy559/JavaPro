package com.org.java8.BuiltInFunctionalInterface;

public class FunctionalInterfaceDemo {

	static int staticOuterValue = 200;
	int outNum = 200;

	public static void main(String[] args) {
		new FunctionalInterfaceDemo().run();
	}
	
	public void run() {
//		Converter<String, ?> converter = (from) -> Integer.valueOf((String) from);
		Converter<String, ?> converter = Integer::valueOf;
		System.out.println(converter.converter("3030"));

		final int outIntValue = 100;
		Converter<String, ?> converter2 = ((from) -> {
			outNum++;
			return  staticOuterValue + outIntValue + Integer.valueOf(from);
		});
		System.out.println(converter2.converter("10"));
	}
}

@FunctionalInterface
interface Converter<F, T> {
	T converter(F from);
}