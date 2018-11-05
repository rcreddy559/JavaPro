package com.org.strings;

public class PassByValue {

	public static void main(String[] args) {
		 
		Balloon red = new Balloon("red");
		Balloon blue = new Balloon("blue");
		System.out.println("Red:"+red.getColor());
		System.out.println("blue:"+blue.getColor());
		
		swap(red, blue);
		
		System.out.println("Red:"+red.getColor());
		System.out.println("blue:"+blue.getColor());
	}
	
	private static void foo(Balloon balloon) { //baloon=100
		balloon.setColor("Red"); //baloon=100
		balloon = new Balloon("Green"); //baloon=200
		balloon.setColor("Blue"); //baloon = 200
	}

	
	public static void swap(Object o1, Object o2){
		Object temp = o1;
		o1=o2;
		o2=temp;
	}


}

class Balloon {
	private String color;
	
	Balloon(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
