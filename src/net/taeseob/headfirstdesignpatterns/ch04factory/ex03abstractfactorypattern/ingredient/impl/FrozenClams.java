package net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.impl;

import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.Clams;

public class FrozenClams implements Clams {

	@Override
	public String toString() {
		return "Frozen Clams from Chesapeake Bay";
	}
}
