package com.org.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FailFastAndFailSafeDemo {

	public static void main(String[] args) {
		failFastArrayList();
//		failSafeLinkedList();
	}

	public static void failFastArrayList() {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			list.add("String :" + i);
		}

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			iterator.remove();
			System.out.println(iterator.next());
			// Exception in thread "main" java.util.ConcurrentModificationException
		}
	}

	public static void failSafeLinkedList() {
		List<String> list = new LinkedList<String>();
		for (int i = 0; i < 10; i++) {
			list.add("String :" + i);
		}

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			list.add("New String one");
			// Exception in thread "main" java.util.ConcurrentModificationException
		}
	}
}
