package net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.pizzastore.ext;

import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredientfactory.PizzaIngredientFactory;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredientfactory.impl.NYPizzaIngredientFactory;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.pizza.Pizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.pizza.ext.CheesePizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.pizza.ext.ClamPizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.pizza.ext.PepperoniPizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.pizza.ext.VeggiePizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.pizzastore.PizzaStore;

public class NYPizzaStore extends PizzaStore {
	
	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
		
		if (type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
		} else if (type.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
		}
		
		return pizza;
	}

}
