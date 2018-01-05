package net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizzastore.ext;

import net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizza.Pizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizza.ext.ChicagoStyleCheesePizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizza.ext.ChicagoStyleClamPizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizza.ext.ChicagoStylePepperoniPizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizza.ext.ChicagoStyleVeggiePizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizzastore.PizzaStore;

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
