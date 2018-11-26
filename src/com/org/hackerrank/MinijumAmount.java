package com.org.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.w3c.dom.ls.LSInput;

public class MinijumAmount {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4, 9, 2, 3);

		tesst(list);
	}

	private static long tesst(List<Integer> list) {
		long total = 0;
		
		int first = list.get(0);
		int second = list.get(1);
		int th = list.get(2);
		int fi = list.get(3);
		
		total = first;
		int temp = second > first ? second-first:second;
		total += temp;
		int tempminus = second-first;
		int temp3 = tempminus > th ? 0: th;
		total += temp3;
		total += fi-th;
		
		return total;
	}
}
