package net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.pizza.ext;

import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredientfactory.PizzaIngredientFactory;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.pizza.Pizza;

public class CheesePizza extends Pizza {
	
	PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		// 원재료 팩토리가 맞기만 하면 어떤 팩토리를 쓰든 상관하지 않음.
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
	}

}
