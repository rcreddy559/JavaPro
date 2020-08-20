package com.org.threads;

public class PrintEvenOdd {

	public static void main(String... args) {
		Printer print = new Printer();
		int max = 10;
		Thread t1 = new Thread(new TaskEvenOdd(print, max, false));
		Thread t2 = new Thread(new TaskEvenOdd(print, max, true));
		t1.start();
		t2.start();
	}

}

class TaskEvenOdd implements Runnable {
	private final int max;
	private final Printer print;
	private final boolean isEvenNumber;

	TaskEvenOdd(Printer print, int max, boolean isEvenNumber) {
		this.print = print;
		this.max = max;
		this.isEvenNumber = isEvenNumber;
	}

	@Override
	public void run() {
		int number = isEvenNumber == true ? 2 : 1;
		while (number <= max) {
			if (isEvenNumber) {
				print.printEven(number);
			} else {
				print.printOdd(number);
			}
			number += 2;
		}
	}
}

class Printer {
	boolean isOdd = false;

	synchronized void printEven(int number) {
		while (isOdd == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Even:" + number);
		isOdd = false;
		notifyAll();
	}

	synchronized void printOdd(int number) {
		while (isOdd == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Odd:" + number);
		isOdd = true;
		notifyAll();
	}
}
