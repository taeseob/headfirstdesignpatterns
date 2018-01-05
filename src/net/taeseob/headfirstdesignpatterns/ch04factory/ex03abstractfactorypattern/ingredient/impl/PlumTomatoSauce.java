package net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.impl;

import net.taeseob.headfirstdesignpatterns.ch04factory.ex03abstractfactorypattern.ingredient.Sauce;

public class PlumTomatoSauce implements Sauce {
	@Override
	public String toString() {
		return "Tomato sauce with plum tomatoes";
	}
}
