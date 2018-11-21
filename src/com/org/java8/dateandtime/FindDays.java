package com.org.java8.dateandtime;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class FindDays {
	public static void main(String[] args) {
		new FindDays().findDaysDemo();
		getWeek(2017, 10, 22);
	}

	private void findDaysDemo() {
		LocalDate today = LocalDate.now();
		LocalDate lastDay = LocalDate.of(2019, Month.JANUARY, 8);

		System.out.printf("Today: %tF, LastDay: %tF = Days Remain: %d\n", today, lastDay,
				ChronoUnit.DAYS.between(today, lastDay));

	}
	
	private static void getWeek(int year, int month, int dayOfMonth) {
		System.out.println("------");
		LocalDate localDate = LocalDate.of(year, month, dayOfMonth);
		System.out.println(localDate.getDayOfWeek().name());
	}
}
