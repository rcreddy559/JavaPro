package com.org.threads;

/*
 * Multi threading Inter Thread Communication 
 * Producer Consumer
 */
class Data {
	int d;
	boolean valueSet = false;

	public synchronized void getD() {
		while (!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		valueSet = false;
		System.out.printf("Get:%d\n", this.d);
		notify();
	}

	public synchronized void setD(int d) {
		while (valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.d = d;
		System.out.printf("Set:%d\n", this.d);
		valueSet = true;
		notify();
	}

}

class Producer implements Runnable {

	Data d;

	public Producer(Data d) {
		this.d = d;
		Thread t = new Thread(this, "Producer");
		t.start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true) {
			this.d.setD(i++);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}

class Consumer implements Runnable {
	Data d;

	public Consumer(Data d) {
		this.d = d;
		Thread t = new Thread(this, "Consumer");
		t.start();
	}

	@Override
	public void run() {
		while (true) {
			d.getD();
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}
}

public class InterThread {

	public static void main(String[] args) {
		Data data = new Data();
		new Producer(data);
		new Consumer(data);

	}

}
