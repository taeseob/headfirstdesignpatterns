package net.taeseob.headfirstdesignpatterns.ch01strategy.ex02duckwithstrategypattern.fly;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("fly FlyWithWings");
	}

}
