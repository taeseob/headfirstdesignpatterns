package net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizzastore.ext;

import net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizza.Pizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizza.ext.NYStyleCheesePizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizza.ext.NYStyleClamPizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizza.ext.NYStylePepperoniPizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizza.ext.NYStyleVeggiePizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizzastore.PizzaStore;

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
