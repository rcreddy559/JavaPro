package com.emc.utils;

public class Car {
	String brand;
	int engineCC;
	int wheelCount;
	int price;

	public Car(String brand, int engineCC, int wheelCount, int price) {
		super();
		this.brand = brand;
		this.engineCC = engineCC;
		this.wheelCount = wheelCount;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getEngineCC() {
		return engineCC;
	}

	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}

	public int getWheelCount() {
		return wheelCount;
	}

	public void setWheelCount(int wheelCount) {
		this.wheelCount = wheelCount;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", engineCC=" + engineCC + ", wheelCount=" + wheelCount + ", price=" + price
				+ "]";
	}

}
