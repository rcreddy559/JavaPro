package com.org.threads;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerInterThreadCom {

	public static void main(String[] args) {

		List<Integer> sharedList = new ArrayList<>();
		int MAX_SIZE = 1;
		Thread t1 = new Thread(new MyProducer(sharedList, MAX_SIZE));
		Thread t2 = new Thread(new MyConsumer(sharedList, MAX_SIZE));
		t1.start();
		t2.start();
	}

}

class MyProducer implements Runnable {
	List<Integer> sharedList = null;
	int MAX_SIZE;
	int i = 0;

	public MyProducer(List<Integer> list, int max) {
		this.sharedList = list;
		this.MAX_SIZE = max;
	}

	@Override
	public void run() {
		while (true) {
			try {
				produce(i++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public void produce(int i) throws InterruptedException {
		synchronized (sharedList) {
			while (sharedList.size() == MAX_SIZE) {
				System.out.println("Shared list is FULL, waiting for consumer to consume");
				sharedList.wait();
			}
		}
		synchronized (sharedList) {
			sharedList.add(i);
			System.out.printf("Produced value:%d \n", i);
			Thread.sleep(1000);
			sharedList.notify();
		}
	}
}

class MyConsumer implements Runnable {
	List<Integer> sharedList = null;
	int MAX_SIZE;

	public MyConsumer(List<Integer> list, int max) {
		this.sharedList = list;
		this.MAX_SIZE = max;
	}

	@Override
	public void run() {
		try {
			while (true) {
				consume();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void consume() throws InterruptedException {
		synchronized (sharedList) {
			while (sharedList.isEmpty()) {
				System.out.println("Shared list is Emptry.. wating for the Producer to produce the values");
				sharedList.wait();
			}
		}
		synchronized (sharedList) {
			Thread.sleep(1000);
			System.out.printf("Comsumed the value: %d\n", sharedList.remove(0));
			sharedList.notify();
		}
	}
}
