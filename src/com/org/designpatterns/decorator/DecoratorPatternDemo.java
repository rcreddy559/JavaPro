package com.org.designpatterns.decorator;

public class DecoratorPatternDemo {
	public static void main(String[] args) {
		Food food = new VegFood();
		Food myOrderFood = new NonVegFood(new ChineesFood(food));
		System.out.println(myOrderFood.getPrice());
		System.out.println(myOrderFood.prepareFood());
	}
}

interface Food {
	String prepareFood();

	double getPrice();
}

class VegFood implements Food {
	@Override
	public double getPrice() {
		return 50.0D;
	}

	@Override
	public String prepareFood() {
		return "Veg Food";
	}
}

class FoodDecotator implements Food {
	Food food;

	public FoodDecotator(Food food) {

		this.food = food;
	}

	@Override
	public double getPrice() {
		return food.getPrice();
	}

	@Override
	public String prepareFood() {
		return food.prepareFood();
	}
}

class NonVegFood extends FoodDecotator {
	public NonVegFood(Food food) {
		super(food);
	}

	@Override
	public double getPrice() {
		return super.getPrice();
	}

	@Override
	public String prepareFood() {
		return super.prepareFood() + "With Roasted Chiken and Chiken Curry";
	}
}

class ChineesFood extends FoodDecotator {
	public ChineesFood(Food food) {
		super(food);
	}

	@Override
	public double getPrice() {
		return super.getPrice();
	}

	@Override
	public String prepareFood() {
		return super.prepareFood() + " With Fried Rice and Manchurian  ";
	}
}
