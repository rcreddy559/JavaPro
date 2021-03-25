package com.org.designpatterns.singleton;

public class LazySingletonDesignPatternDemo {

	public static void main(String[] args) {
		LazyDataBaseConnection con1 = LazyDataBaseConnection.getInstance();
		LazyDataBaseConnection con2 = LazyDataBaseConnection.getInstance();
		Runtime.getRuntime();
	}
}

class LazyDataBaseConnection {
	private static volatile LazyDataBaseConnection connection = null;

	private LazyDataBaseConnection() {

	}

	public static LazyDataBaseConnection getInstance() {

		if (connection == null) {
			synchronized (LazyDataBaseConnection.class) {
				if (connection == null) {
					connection = new LazyDataBaseConnection();
				}
			}
		}
		return connection;
	}
}
