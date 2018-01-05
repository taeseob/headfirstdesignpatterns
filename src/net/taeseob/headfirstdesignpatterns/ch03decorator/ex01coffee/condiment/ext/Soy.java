package net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee.condiment.ext;

import net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee.beverage.Beverage;
import net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee.condiment.CondimentDecorator;

public class Soy extends CondimentDecorator {

	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 두유";
	}

	@Override
	public double cost() {
		return 0.15 + beverage.cost();
	}

}
