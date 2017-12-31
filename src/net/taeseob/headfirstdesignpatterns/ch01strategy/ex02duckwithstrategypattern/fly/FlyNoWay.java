package net.taeseob.headfirstdesignpatterns.ch01strategy.ex02duckwithstrategypattern.fly;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("fly FlyNoWay");
	}

}
