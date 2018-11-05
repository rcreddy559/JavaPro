package com.org.java.functionalinterface;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {

		new ConsumerDemo().demo3();
	}

	private void demo1() {
		Consumer<String> consumer = (s) -> System.out.println(s);
		consumer.accept("This is consumer string ");

	}

	private void demo2() {
		Consumer<Date> oneDayIncreate = new Consumer<Date>() {
			@Override
			public void accept(Date date) {
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(date);
				calendar.add(Calendar.DAY_OF_YEAR, 1);
				date = calendar.getTime();
				System.out.println(date);
			}
		};

		Consumer<Date> dateConsumer = new Consumer<Date>() {
			@Override
			public void accept(Date date) {
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy EEEE");
				System.out.println(simpleDateFormat.format(date));
			}
		};

		dateConsumer.andThen(oneDayIncreate).accept(new Date());
	}

	private void demo3() {
		// TODO Auto-generated method stub
		int x = 99;
		Consumer<Integer> myConsumer = (y) -> {
			System.out.println("x = " + x); // Statement A
			System.out.println("y = " + y);
		};

		myConsumer.accept(x);

	}
}
