package net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizza.ext;

import net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizza.Pizza;

public class NYStyleCheesePizza extends Pizza {
	
	public NYStyleCheesePizza() {
		name = "NY Style Sauce and Cheese Pizza";
		dough = "Thin Crust Dough";
		sauce = "Marinara Sauce";
		toppings.add("Grated Reggiano Cheese");
	}
}
