package net.taeseob.headfirstdesignpatterns.ch01strategy.ex02duckwithstrategypattern.duck.ext;

import net.taeseob.headfirstdesignpatterns.ch01strategy.ex02duckwithstrategypattern.duck.Duck;
import net.taeseob.headfirstdesignpatterns.ch01strategy.ex02duckwithstrategypattern.fly.impl.FlyNoWay;
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
