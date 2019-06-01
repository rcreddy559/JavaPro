package com.org.innerclass;

public class StaticInnerCalssDemo {

	public static void main(String... args) {
		// MyInner inner = new MyInner("Divija", 98989);
		// System.out.println(inner.toString());
		MyInnerStatic.printDetails();
	}

	static class MyInnerStatic {
		public static void printDetails() {
			System.out.println("Printing details");
		}
	}

	class MyInner {
		MyInner() {

		}

		public MyInner(String n, int p) {
			this.name = n;
			this.phoneNumber = p;

		}

		@Override
		public String toString() {
			return "MyInner [name=" + name + ", phoneNumber=" + phoneNumber + "]";
		}

		private String name;
		private int phoneNumber;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

	}
}
