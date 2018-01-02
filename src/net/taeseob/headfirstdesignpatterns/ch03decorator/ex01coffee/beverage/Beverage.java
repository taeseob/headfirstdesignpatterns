package net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee.beverage;

public abstract class Beverage {
	String description = "제목 없음";
	
	public String getDescription() {
		return this.description;
	}
	
	public abstract double cost();
}
