package net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.impl;

import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.Dough;

public class ThinCrustDough implements Dough {
	@Override
	public String toString() {
		return "Thin Crust Dough";
	}
}
