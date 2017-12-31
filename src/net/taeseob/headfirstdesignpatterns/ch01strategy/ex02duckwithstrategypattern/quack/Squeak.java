package net.taeseob.headfirstdesignpatterns.ch01strategy.ex02duckwithstrategypattern.quack;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("quack Squeak");
	}

}
