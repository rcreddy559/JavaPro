package com.org.java8.dateandtime;

import java.time.LocalDate;

public class CalculateWeekDays {

    public static void main(String[] args) {
        getMinusDays(LocalDate.now().minusDays(1));
    }

    static void getMinusDays(LocalDate inputDate) {
        long minusDays = 5;
        System.out.println(inputDate.getDayOfWeek().getValue());

    }
}
