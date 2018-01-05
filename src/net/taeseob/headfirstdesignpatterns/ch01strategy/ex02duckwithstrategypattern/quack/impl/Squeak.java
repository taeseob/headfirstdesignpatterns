package net.taeseob.headfirstdesignpatterns.ch01strategy.ex02duckwithstrategypattern.quack.impl;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("quack Squeak");
	}

}
