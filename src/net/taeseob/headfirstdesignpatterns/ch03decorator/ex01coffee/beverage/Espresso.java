package net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee.beverage;

public class Espresso extends Beverage {

	public Espresso() {
		this.description = "에스프레소";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}

}
