package net.taeseob.headfirstdesignpatterns.ch01strategy.ex02duckwithstrategypattern.duck;

import net.taeseob.headfirstdesignpatterns.ch01strategy.ex02duckwithstrategypattern.fly.FlyNoWay;
import net.taeseob.headfirstdesignpatterns.ch01strategy.ex02duckwithstrategypattern.quack.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("display ModelDuck");
	}

}
