package com.org.designpatterns.singleton;

public class LazySingletonDesignPatternDemo {

}

class LazyDataBaseConnection {
	private static LazyDataBaseConnection connection;

	private LazyDataBaseConnection() {

	}

	public static LazyDataBaseConnection getInstance() {

		if (connection == null) {
			synchronized (connection) {
				if (connection == null) {
					connection = new LazyDataBaseConnection();
				}
			}
		}
		return connection;
	}
}
