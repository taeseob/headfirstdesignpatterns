package net.taeseob.headfirstdesignpatterns.ch01strategy.ex02duckwithstrategypattern.duck;

import net.taeseob.headfirstdesignpatterns.ch01strategy.ex02duckwithstrategypattern.fly.FlyBehavior;
import net.taeseob.headfirstdesignpatterns.ch01strategy.ex02duckwithstrategypattern.quack.QuackBehavior;

public abstract class Duck {
	
	/* 나는 행동과 소리내는 행동을 특정 구상 클래스 형식으로 선언하지 않고
	 * 두 개의 인터페이스 형식의 인스턴스 변수로 추가한다.
	 * 각 오리 객체에서는 실행시에 이 변수에 특정 행동 형식에 대한 레퍼런스를
	 * 다형적으로 설정한다.
	 * 
	 * 스트래티지 패턴에서는 알고리즘군을 정의하고 각각을 캡슐화하여
	 * 교환해서 사용할 수 있도록 만든다.
	 * 알고리즘을 사용하는 클라이언트와는 독립적으로
	 * 알고리즘을 변경할 수 있다.
	 * 
	 * 1장의 객체지향 디자인 원칙 :
	 * 달라지는 부분을 달라지지 않는 부분으로부터 분리시킨다.
	 * 구현이 아닌 인터페이스(상위 형식)에 맞춰서 프로그래밍한다.
	 * 상속보다는 구성을 활용한다.
	 * 
	 * 쉽게 풀면 :
	 * 변화에 대응할 수 있도록, 달라지는 부분은 분리시켜서(캡슐화) 유연성을 향상시킨다.
	 * 변수를 선언할 때 상위 형식으로 선언한다.
	 * 상속보다는 속성으로 갖게 한다. (유연성을 위해)
	 * 
	 * 다시 정리하면 :
	 * 달라지는 부분은 분리시켜서 상위 형식의 속성으로 갖게 한다.
	 * (나는 행동을 FlyBehavior 인터페이스 타입의 flyBehavior 속성으로 갖게 한다.)
	 */
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	// 동적으로 행동을 지정하기 위한 세터 메소드
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	public void swim() {
		System.out.println("swim");
	}
	
	abstract public void display();

	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
}
