package net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee.beverage;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		this.description = "다크 로스트";
	}
	
	@Override
	public double cost() {
		return 0.99;
	}

}
