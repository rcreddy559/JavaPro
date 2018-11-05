package com.emc.java8.Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	private List<String> booksList = Arrays.asList("Effective Java",
		      "Clean Code", "Test Driven");
	
	private String getbook(String value) {
		 String bookName = null;
		 for(String book: booksList) {
			 if(book.startsWith(value)) {
				 bookName = book;
			 }
		 }
		 return bookName;

	}
	private String getBookInJava8(String prefix) {
		 Optional<String> bookName = 
				 booksList.stream().filter(e->e.startsWith(prefix)).findFirst();
		 return bookName.isPresent() ? bookName.get() : "";

	}
	public static void main(String[] args) {
		System.out.println(new OptionalDemo().getbook("2"));
		System.out.println(new OptionalDemo().getBookInJava8("2"));

	}

}
