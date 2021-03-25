package com.org.java8.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IODemo {

	public static void main(String[] args) {
		String fileName = "/Users/ravi/Documents/GitHub/JavaPro/src/com/org/java8/io/PortFolioEqtSummary.csv";
//		String fileName = "./PortFolioEqtSummary.csv";
		 readFile(fileName);
		// readiFileMap(fileName);
		// readFileJava7(fileName);
	}

	private static void readFileJava7(String fileName) {
		
		try(BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void readFile(String fileName) {
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			// stream.forEach(System.out::println);
			stream.forEach(new Consumer<String>() {
				@Override
				public void accept(String t) {
					System.out.println(t);
				}
			});

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readiFileMap(String fileName) {
		List<String> listOfLines;
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			listOfLines = stream.map(new Function<String, String>() {
				@Override
				public String apply(String value) {
					if (value.length() > 60) {
						return value.toUpperCase();
					}
					return value;
				}
			}).collect(Collectors.toList());
			listOfLines.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}