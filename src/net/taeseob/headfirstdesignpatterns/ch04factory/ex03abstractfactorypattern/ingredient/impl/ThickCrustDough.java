package net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.impl;

import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.Dough;

public class ThickCrustDough implements Dough {
	@Override
	public String toString() {
		return "ThickCrust style extra thick crust dough";
	}
}
