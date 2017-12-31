package net.taeseob.headfirstdesignpatterns.ch01strategy.ex01duck;

public abstract class Duck {
	
	// RubberDuck은 삑삑 소리를 내고, DecoyDuck은 소리를 내지 않는다.
	public void quack() {
		System.out.println("quack");
	}
	
	public void swim() {
		System.out.println("swim");
	}
	
	abstract public void display();

	// p.41 : 요구사항 추가
	// 하지만 날지 않는 오리까지 날게 만든다.
	// RubberDuck, DecoyDuck은 fly()가 아무것도 안 하도록 일일히 override
	public void fly() {
		System.out.println("fly");
	}
	
	/* interface를 사용한다면?
	 * 서브클래스에서 Flyable, Quackable을 구현하도록 한다면
	 * 그러한 행동에 대한 코드 재사용을 전혀 기대할 수 없다.
	 * (java interface에는 구현 된 코드가 들어가지 않기 때문에)
	 * 
	 * quack()과 fly()는 오리마다 변경되는 부분이므로,
	 * Duck 클래스에서 뽑아내자. ---> ex02duckwithstrategypattern
	 */
}
