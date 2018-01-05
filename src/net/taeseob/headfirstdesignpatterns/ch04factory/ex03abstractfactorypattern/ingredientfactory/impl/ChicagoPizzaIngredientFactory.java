package net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredientfactory.impl;

import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.Cheese;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.Clams;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.Dough;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.Pepperoni;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.Sauce;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.Veggies;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.impl.BlackOlives;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.impl.Eggplant;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.impl.FrozenClams;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.impl.MozzarellaCheese;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.impl.PlumTomatoSauce;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.impl.SlicedPepperoni;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.impl.Spinach;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.impl.ThickCrustDough;
import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredientfactory.PizzaIngredientFactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies[] veggies = { new BlackOlives(), new Spinach(), new Eggplant() };
		return veggies ;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clams createClam() {
		return new FrozenClams();
	}

}
