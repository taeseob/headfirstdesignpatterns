package net.taeseob.headfirstdesignpatterns.ch01strategy.ex01duck;

public class DecoyDuck extends Duck {

	@Override
	public void display() {
		System.out.println("display DecoyDuck");
	}

	@Override
	public void quack() {
		// Do nothing
	}
	
	@Override
	public void fly() {
		// Do nothing
	}
}
