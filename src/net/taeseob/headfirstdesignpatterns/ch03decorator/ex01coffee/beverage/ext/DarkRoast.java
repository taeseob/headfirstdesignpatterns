package net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee.beverage.ext;

import net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee.beverage.Beverage;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		this.description = "다크 로스트";
	}
	
	@Override
	public double cost() {
		return 0.99;
	}

}
