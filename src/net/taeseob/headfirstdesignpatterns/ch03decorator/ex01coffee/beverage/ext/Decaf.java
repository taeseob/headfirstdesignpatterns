package net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee.beverage.ext;

import net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee.beverage.Beverage;

public class Decaf extends Beverage {

	public Decaf() {
		this.description = "디카페인";
	}
	
	@Override
	public double cost() {
		return 1.05;
	}

}
