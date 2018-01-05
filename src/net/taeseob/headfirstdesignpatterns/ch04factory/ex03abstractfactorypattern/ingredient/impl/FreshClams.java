package net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.impl;

import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.Clams;

public class FreshClams implements Clams {

	@Override
	public String toString() {
		return "Fresh Clams from Long Island Sound";
	}
}
