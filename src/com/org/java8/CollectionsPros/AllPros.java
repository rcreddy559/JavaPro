package com.org.java8.CollectionsPros;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AllPros {

	public static void main(String[] args) {
		new AllPros().arrayListSearch();
	}

	private void linkedlistSearch() {
		List<Integer> intList = new LinkedList<>();

		intList.add(1001);
		intList.add(1002);
		intList.add(1003);
		intList.add(1004);
		intList.add(1005);
		intList.add(1003);
		
		System.out.println(intList.indexOf(1003));

	}
	
	private void arrayListSearch() {
		List<Integer> intList = new ArrayList<>();

		intList.add(1001);
		intList.add(1002);
		intList.add(1003);
		intList.add(1004);
		intList.add(1005);
		intList.add(1003);
		System.out.println(intList.indexOf(1003));

	}

}
