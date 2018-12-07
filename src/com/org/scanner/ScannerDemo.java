package com.org.scanner;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		 demo1();

	}

	private static void demo1() {
		String str = "Testring 10 12.2 one true two false c and 101";
		FileWriter fileWriter = null;
		FileReader fileReader = null;
		 
		Scanner scanner = null;
		try {
			fileWriter = new FileWriter("input.txt");
			fileWriter.write(str);
			
			fileReader = new FileReader("input.txt");
			scanner = new Scanner(fileReader);
			
			while(scanner.hasNext()) {
				System.out.println(",,,,");
				System.out.println(scanner.next().getClass().getName());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
				try {
					if(fileWriter != null) fileWriter.close();
					if(fileReader != null) fileReader.close();
					if(scanner != null) scanner.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		
	}

}
