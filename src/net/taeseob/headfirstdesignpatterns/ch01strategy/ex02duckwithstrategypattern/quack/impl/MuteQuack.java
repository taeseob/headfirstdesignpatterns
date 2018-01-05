package net.taeseob.headfirstdesignpatterns.ch01strategy.ex02duckwithstrategypattern.quack.impl;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("quack MuteQuack");
	}

}
