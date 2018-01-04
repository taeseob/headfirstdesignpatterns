package net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizzastore;

import net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizza.ChicagoStyleCheesePizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizza.ChicagoStyleClamPizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizza.ChicagoStylePepperoniPizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizza.ChicagoStyleVeggiePizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		} else if (type.equals("pepperoni")) {
			return new ChicagoStylePepperoniPizza();
		} else if (type.equals("clam")) {
			return new ChicagoStyleClamPizza();
		} else if (type.equals("veggie")) {
			return new ChicagoStyleVeggiePizza();
		} else {
			return null;
		}
	}

}
