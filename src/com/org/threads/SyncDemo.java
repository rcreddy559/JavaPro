package com.org.threads;

public class SyncDemo {
	private int count = 0;
	
	private synchronized void increasee() {
		count++;
	}

	public static void main(String[] args) {
		new SyncDemo().demo();

	}

	public void demo() {
		Runnable r1 = () -> {
			for (int i = 0; i < 10000; i++) {
				increasee();
			}
		};

		Runnable r2 = () -> {
			for (int i = 0; i < 10000; i++) {
				increasee();			}
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.printf("Count: %d", count);
	}

}
