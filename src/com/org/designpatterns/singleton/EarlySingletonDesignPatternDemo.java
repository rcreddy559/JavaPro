package com.org.designpatterns.singleton;

public class EarlySingletonDesignPatternDemo {

	public static void main(String[] args) {
		DataBaseConnection connection = DataBaseConnection.getInstance();

	}
}

class DataBaseConnection {
	private static DataBaseConnection dbc = new DataBaseConnection();

	private DataBaseConnection() {
	}

	public static DataBaseConnection getInstance() {
		return dbc;
	}
}
