package com.org.java8.dateandtime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class FindDays {
	public static void main(String[] args) {
		new FindDays().findDaysDemo();
	}

	private void findDaysDemo() {
		LocalDate today = LocalDate.now();
		LocalDate lastDay = LocalDate.of(2019, Month.JANUARY, 8);

		System.out.printf("Today: %tF, LastDay: %tF = Days Remain: %d", today, lastDay,
				ChronoUnit.DAYS.between(today, lastDay));

	}
}
