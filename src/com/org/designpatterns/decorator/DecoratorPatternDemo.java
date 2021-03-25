package com.org.designpatterns.decorator;

public class DecoratorPatternDemo {
	public static void main(String[] args) {
		Food food = new VegFood();
		Food myOrderFood = new NonVegFood(new ChineesFood(food));
		System.out.println(myOrderFood.getPrice());
		System.out.println(myOrderFood.prepareFood());

		Food palakPanner = new PalakPanner(myOrderFood);
		System.out.println(palakPanner.getPrice());
		System.out.println(palakPanner.prepareFood());
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


class FoodDecorator implements Food {
	Food food;

	public FoodDecorator(Food food) {
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



class NonVegFood extends FoodDecorator {
	public NonVegFood(Food food) {
		super(food);
	}

	@Override
	public double getPrice() {
		return super.getPrice() + 50D;
	}

	@Override
	public String prepareFood() {
		return super.prepareFood() + " With Roasted Chicken and Chicken Curry";
	}
}

class ChineesFood extends FoodDecorator {
	public ChineesFood(Food food) {
		super(food);
	}

	@Override
	public double getPrice() {
		return super.getPrice();
	}

	@Override
	public String prepareFood() {
		return super.prepareFood() + " With Fried Rice and Manchurian  ";
	}
}


class PalakPanner extends FoodDecorator {

	public PalakPanner(Food food) {
		super(food);
	}

	@Override
	public double getPrice() {
		return super.getPrice() + 100D;
	}

	@Override
	public String prepareFood() {
		return super.prepareFood() + " With Palak Panner";
	}
}