package net.taeseob.headfirstdesignpatterns.ch01strategy.ex02duckwithstrategypattern.quack;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("quack Quack");
	}

}
