package net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.impl;

import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.Cheese;

public class MozzarellaCheese implements Cheese {

	@Override
	public String toString() {
		return "Shredded Mozzarella";
	}
}
