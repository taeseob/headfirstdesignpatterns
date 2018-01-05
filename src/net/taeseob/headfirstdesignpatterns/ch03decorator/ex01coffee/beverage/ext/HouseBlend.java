package net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee.beverage.ext;

import net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee.beverage.Beverage;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		this.description = "하우스 블렌드 커피";
	}
	
	@Override
	public double cost() {
		return 0.89;
	}

}
