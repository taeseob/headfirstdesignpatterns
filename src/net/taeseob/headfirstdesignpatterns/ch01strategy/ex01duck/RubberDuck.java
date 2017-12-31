package net.taeseob.headfirstdesignpatterns.ch01strategy.ex01duck;

public class RubberDuck extends Duck {

	@Override
	public void display() {
		System.out.println("display RubberDuck");
	}
	
	@Override
	public void quack() {
		System.out.println("ppik not quack");
	}

	@Override
	public void fly() {
		// Do nothing
	}
}
