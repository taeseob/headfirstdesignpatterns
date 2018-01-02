package net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee;

import net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee.beverage.Beverage;
import net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee.beverage.DarkRoast;
import net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee.beverage.Espresso;
import net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee.beverage.HouseBlend;
import net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee.condiment.Mocha;
import net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee.condiment.Soy;
import net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee.condiment.Whip;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		Beverage espresso = new Espresso();
		System.out.println(espresso.getDescription() + " $" + espresso.cost());
		
		Beverage darkRoast = new DarkRoast();
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Mocha(darkRoast);
		darkRoast = new Whip(darkRoast);
		System.out.println(darkRoast.getDescription() + " $" + darkRoast.cost());
		
		Beverage houseBlend = new HouseBlend();
		houseBlend = new Soy(houseBlend);
		houseBlend = new Mocha(houseBlend);
		houseBlend = new Whip(houseBlend);
		System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
	}

}
