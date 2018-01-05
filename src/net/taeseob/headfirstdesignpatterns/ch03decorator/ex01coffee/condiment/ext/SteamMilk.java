package net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee.condiment.ext;

import net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee.beverage.Beverage;
import net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee.condiment.CondimentDecorator;

public class SteamMilk extends CondimentDecorator {

	Beverage beverage;
	
	public SteamMilk(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 스팀 밀크";
	}

	@Override
	public double cost() {
		return 0.10 + beverage.cost();
	}

}
