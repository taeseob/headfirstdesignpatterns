package net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee.condiment;

import net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {

	@Override
	public abstract String getDescription();

}
