package net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.pizza.ext;

import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredientfactory.PizzaIngredientFactory;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.pizza.Pizza;

public class PepperoniPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
 
	public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	@Override
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
		pepperoni = ingredientFactory.createPepperoni();
	}
}
