package net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee.condiment.ext;

import net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee.beverage.Beverage;
import net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee.condiment.CondimentDecorator;

public class Whip extends CondimentDecorator {

	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 휘핑 크림";
	}

	@Override
	public double cost() {
		return 0.10 + beverage.cost();
	}

}
