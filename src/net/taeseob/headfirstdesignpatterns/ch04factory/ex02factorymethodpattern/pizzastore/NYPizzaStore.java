package net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizzastore;

import net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizza.NYStyleCheesePizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizza.NYStyleClamPizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizza.NYStylePepperoniPizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizza.NYStyleVeggiePizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else if (type.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (type.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else {
			return null;
		}
	}

}
