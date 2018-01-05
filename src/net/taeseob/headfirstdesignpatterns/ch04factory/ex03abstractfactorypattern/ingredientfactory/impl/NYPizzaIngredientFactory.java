package net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredientfactory.impl;

import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.Cheese;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.Clams;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.Dough;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.Pepperoni;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.Sauce;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.Veggies;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.impl.FreshClams;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.impl.Garlic;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.impl.MarinaraSauce;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.impl.Mushroom;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.impl.Onion;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.impl.RedPepper;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.impl.ReggianoCheese;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.impl.SlicedPepperoni;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.impl.ThinCrustDough;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredientfactory.PizzaIngredientFactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies ;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FreshClams();
	}

}
