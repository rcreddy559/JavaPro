package com.org.hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RefromattingDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> newDates = new ArrayList<>();
		newDates.add("1st Mar 1984");
		reformatDate(newDates);
	}
	

    public static List<String> reformatDate(List<String> dates) {
        List<String> newDates = new ArrayList<>();
    // Write your code here
    Map<String, String> datesMap = new HashMap<>();
        datesMap.put("1st", "01");
        datesMap.put("2nd", "02");
        datesMap.put("3rd", "03");
        datesMap.put("4th", "04");
        datesMap.put("5th", "05");
        datesMap.put("6th", "06");
        datesMap.put("7th", "07");
        datesMap.put("8th", "08");
        datesMap.put("9th", "09");
        datesMap.put("10th", "10");
        datesMap.put("11th", "11");
        datesMap.put("12th", "12");
        datesMap.put("13th", "13");
        datesMap.put("14th", "14");
        datesMap.put("15th", "15");
        datesMap.put("16th", "16");
        datesMap.put("17th", "17");
        datesMap.put("18th", "18");
        datesMap.put("19th", "19");
        datesMap.put("20th", "20");
        datesMap.put("21st", "21");
        datesMap.put("22nd", "22");
        datesMap.put("23rd", "23");
        datesMap.put("24th", "24");
        datesMap.put("25th", "25");
        datesMap.put("26th", "26");
        datesMap.put("27th", "27");
        datesMap.put("28th", "28");
        datesMap.put("29th", "29");
        datesMap.put("30th", "30");
        datesMap.put("31st", "31");

        Map<String, String> months = new HashMap<>();
        months.put("Jan", "01");
        months.put("Feb", "02");
        months.put("Mar", "03");
        months.put("Apr", "04");
        months.put("May", "05");
        months.put("Jun", "06");
        months.put("Jul", "07");
        months.put("Aug", "08");
        months.put("Sep", "09");
        months.put("Oct", "10");
        months.put("Nov", "11");
        months.put("Dec", "12");
        Scanner input =  null;
        for(String date: dates) {
            input = new Scanner(date);
            String[] d = input.nextLine().split(" ");
            String temp =  d[2];
            temp += "-"+ months.get(d[1]);
            temp += "-"+ datesMap.get(d[0]);
            System.out.println(temp);
            newDates.add(temp);
        }
        input.close();
        return newDates;
    }


}
