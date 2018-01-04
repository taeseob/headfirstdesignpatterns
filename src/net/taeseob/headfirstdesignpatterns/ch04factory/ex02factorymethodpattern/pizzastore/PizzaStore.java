package net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizzastore;

import net.taeseob.headfirstdesignpatterns.ch04factory.ex02factorymethodpattern.pizza.Pizza;

// 생산자(Creator) 클래스
public abstract class PizzaStore {
	
	/*
	 * 각 분점마다 달라질 수 있는 것은 피자의 스타일 뿐.
	 * 팩토리 객체 대신 이 추상 메소드를 사용하여
	 * 분점의 스타일대로 피자를 만들도록 한다.
	 * PizzaStore의 서브클래스에 따라 피자의 종류가 결정된다.
	 * 
	 * 모든 팩토리 패턴에서는 객체 생성을 캡슐화한다.
	 * 팩토리 메소드 패턴(Factory Method Pattern)에서는
	 * 서브클래스에서 어떤 클래스의 인스턴스를 만들지 결정하게 함으로써 객체 생성을 캡슐화한다.
	 * (정확히는, 사용하는 서브클래스에 따라 어떤 객체 인스턴스가 생산될지 결정된다.)
	 * 
	 * 
	 * 4장의 객체지향 디자인 원칙 : 의존성 뒤집기 원칙 (Dependency Inversion Principle)
	 * 추상화된 것에 의존하도록 만들어라.
	 * 구상 클래스에 의존하도록 만들지 마라.
	 * 
	 * 즉, 고수준 구성요소가 저수준 구성요소에 의존하면 안 된다.
	 * (ex01simplefactory.PizzaStore의 주석 처리 된 코드 참조)
	 * PizzaStore는 고수준 구성요소, 피자 객체들은 저수준 구성요소라고 할 수 있다.
	 * 
	 * 팩토리 메소드 패턴을 적용함으로써
	 * PizzaStore와 피자 객체들이 모두 추상 클래스인 Pizza에 의존하게 된다.
	 * 의존성이 [PizzaStore ---> 피자 객체들]에서
	 * [PizzaStore ---> Pizza <--- 피자 객체들]로 바뀐다.
	 * 피자 객체들과 관련된 의존성 방향이 뒤집어진다. (inversion)
	 * 
	 * 
	 * 이 예제에서 PizzaStore는 생산자(Creator) 클래스,
	 * Pizza는 제품(Product) 클래스이다.
	 * 
	 * 추상 생산자 클래스에
	 * 서브클래스에서 제품(객체)을 생산하기 위해 구현할
	 * 팩토리 메소드(추상 메소드)를 정의한다.
	 * 
	 * 제품 클래스의 객체는 생산자의 서브클래스에 의해 만들어지고,
	 * 생산자 자체에서는 절대로 어떤 구상 제품 클래스가 만들어질지 미리 알 수 없다.
	 * 
	 * 생산자 클래스와 제품 클래스는 병렬 계층구조이다.
	 */
	protected abstract Pizza createPizza(String type);
	
	/*
	 * 이미 주문 시스템이 잘 갖춰져 있으므로,
	 * 모든 분점에서 똑같이 진행되도록 한다.
	 * 고쳐서 사용할 수 없게 하고 싶으면 final 사용.
	 * orderPizza 메소드에서는 어떤 피자가 만들어지는지 전혀 알 수 없다.
	 */
	public final Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
}
