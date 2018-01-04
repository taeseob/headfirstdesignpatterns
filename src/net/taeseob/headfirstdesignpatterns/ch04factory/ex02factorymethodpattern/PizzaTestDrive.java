package net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern;

import net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizza.Pizza;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizzastore.ChicagoPizzaStore;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizzastore.NYPizzaStore;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizzastore.PizzaStore;

public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYPizzaStore();
		Pizza ethanPizza = nyPizzaStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + ethanPizza.getName() + "\n");
		
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		Pizza joelPizza = chicagoPizzaStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + joelPizza.getName() + "\n");
	}
	
}
