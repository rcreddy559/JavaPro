package com.org.java8.lambda.consumer;

import com.org.utils.EmpUtils;

public class ConsumerStreamDemo {

	public static void main(String[] args) {
		test1();
	}

	public static void test1() {
		var employees = new EmpUtils().getEmployees();
		employees.stream().filter(e -> e.getEmployeeNum().equals("E1001")).forEach(e -> System.out.println(e));
	}
}
