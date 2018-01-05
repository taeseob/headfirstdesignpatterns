package net.taeseob.headfirstdesignpatterns.ch01strategy.ex02duckwithstrategypattern.fly.impl;

import net.taeseob.headfirstdesignpatterns.ch01strategy.ex02duckwithstrategypattern.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("fly FlyNoWay");
	}

}
