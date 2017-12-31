package net.taeseob.headfirstdesignpatterns.ch01strategy.ex02duckwithstrategypattern.duck;

import net.taeseob.headfirstdesignpatterns.ch01strategy.ex02duckwithstrategypattern.fly.FlyWithWings;
import net.taeseob.headfirstdesignpatterns.ch01strategy.ex02duckwithstrategypattern.quack.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		/* 소리내는 행동과 나는 행동을 각각
		 * Quack과 FlyWithWings 객체에 위임
		 */
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("display MallardDuck");
	}

}
