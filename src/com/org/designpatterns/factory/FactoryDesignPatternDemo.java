package com.org.designpatterns.factory;

public class FactoryDesignPatternDemo {

	public static void main(String[] args) {
		PlanFactory planFactory = new PlanFactory();

		Plan plan = planFactory.getPlan("DOMESTICPLAN");
		plan.getRate();
		plan.calculateBill(12);

	}

}

abstract class Plan {
	protected double rate;

	abstract void getRate();

	public void calculateBill(int units) {
		System.out.println("Bill: " + rate * units);
	}

}

class DomesticPlan extends Plan {
	@Override
	void getRate() {
		this.rate = 3.50;
	}
}

class CommercialPlan extends Plan {
	@Override
	void getRate() {
		this.rate = 7.50;
	}
}

class InstitutionslPlan extends Plan {
	@Override
	void getRate() {
		this.rate = 5.50;
	}
}

class PlanFactory {
	public Plan getPlan(String planType) {
		Plan plan = null;

		if (planType == null || "".equals(planType)) {
			plan = null;
		} else if (planType.equals("DOMESTICPLAN")) {
			plan = new DomesticPlan();
		} else if (planType.equals("COMMERCIALPLAN")) {
			plan = new CommercialPlan();
		} else {
			plan = new InstitutionslPlan();
		}

		return plan;
	}
}
