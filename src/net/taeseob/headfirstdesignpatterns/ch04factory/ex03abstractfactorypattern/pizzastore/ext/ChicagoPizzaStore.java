package net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.pizzastore.ext;

import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredientfactory.PizzaIngredientFactory;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredientfactory.impl.ChicagoPizzaIngredientFactory;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.pizza.Pizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.pizza.ext.CheesePizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.pizza.ext.ClamPizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.pizza.ext.PepperoniPizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.pizza.ext.VeggiePizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.pizzastore.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {
	
	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
		
		if (type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");
		} else if (type.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");
		}
		
		return pizza;
	}

}
