package com.org.threads;

import java.util.Scanner;

class Processor extends Thread {
	boolean running = true;
	@Override
	public void run() {
		while (running) {
			System.out.println("Hello!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
	}
	
	public void shutDown() {
		this.running = false;
	}
}
public class App {

	public static void main(String[] args) {
		Processor processor = new Processor();
		processor.start();
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		
		processor.shutDown();
	}
}
