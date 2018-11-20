package com.org.hackerrank;

import java.time.LocalDate;

public class JavaDateAndTime {
 public static void main(String[] args) {
	
}
 public static String findDay(int month, int day, int year) {
     LocalDate localTime = LocalDate.of(year, month, month);
     return localTime.getDayOfWeek().name();
 }
}
