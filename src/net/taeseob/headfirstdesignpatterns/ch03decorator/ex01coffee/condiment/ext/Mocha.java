package net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee.condiment.ext;

import net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee.beverage.Beverage;
import net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee.condiment.CondimentDecorator;

public class Mocha extends CondimentDecorator {

	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 모카";
	}

	@Override
	public double cost() {
		return 0.20 + beverage.cost();
	}

}
