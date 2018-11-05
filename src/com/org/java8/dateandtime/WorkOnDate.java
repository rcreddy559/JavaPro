package com.org.java8.dateandtime;

import java.util.Calendar;
import java.util.Date;

public class WorkOnDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal1.setTime(new Date(2018, 07, 02));
        cal2.setTime(new Date(2011, 02, 02));
        //System.out.println(cal1 - cal2);
	}

}
