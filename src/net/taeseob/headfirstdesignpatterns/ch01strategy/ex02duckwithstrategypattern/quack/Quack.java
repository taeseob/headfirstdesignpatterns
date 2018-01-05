package net.taeseob.headfirstdesignpatterns.ch01strategy.ex02duckwithstrategypattern.quack;

import net.taeseob.headfirstdesignpatterns.ch01strategy.ex02duckwithstrategypattern.quack.impl.QuackBehavior;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("quack Quack");
	}

}
