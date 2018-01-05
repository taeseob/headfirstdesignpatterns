package net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredientfactory;

import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.Cheese;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.Clams;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.Dough;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.Pepperoni;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.Sauce;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.Veggies;

public interface PizzaIngredientFactory {

	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
	
}
