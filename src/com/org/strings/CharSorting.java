package com.org.strings;

import java.util.Arrays;

public class CharSorting {
	public static void main(String[] args) {
		String name = "thisiscarsorting";
		char[] nameArray = name.toCharArray();
		sortChar(nameArray);
	}

	private static void sortChar(char[] nameArray) {
		// TODO Auto-generated method stub
		Arrays.sort(nameArray);
	}
}
