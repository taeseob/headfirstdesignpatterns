package net.taeseob.headfirstdesignpatterns.ch03decorator.ex01coffee.beverage;

public abstract class Beverage {
	/*
	 * DarkRoast 객체를 Mocha 객체로 감싸고,
	 * Mocha 객체를 Whip 객체로 감싸고,
	 * 가장 바깥 데코레이터인 Whip의 cost()를 호출하면
	 * Mocha의 cost()를 호출하고 DarkRoast의 cost()를 호출한다.
	 * 
	 * DarkRoast는 Beverage를 확장한다.
	 * Mocha는 Beverage를 확장한 CondimentDecorator를 확장하는데,
	 * Beverage를 속성(구성요소)으로 갖는다.
	 * (어느 Beverage의 확장을 감쌀지 동적으로 정할 수 있도록)
	 * 
	 * 데코레이터 패턴에서는 객체에 추가적인 요건을 동적으로 첨가한다.
	 * 서브클래스 만드는 것을 통해서 기능을 유연하게 확장할 수 있다.
	 * 데코레이터는 자신이 장식하고 있는 객체에게 어떤 행동을 위임하는 것 외에
	 * 원하는 추가적인 작업을 수행할 수 있다.
	 * 
	 * 3장의 객체지향 디자인 원칙 : OCP (Open-Closed Principle)
	 * 클래스는 확장에 대해서는 열려 있어야 하지만
	 * 코드 변경에 대해서는 닫혀 있어야 한다.
	 * 
	 * 기존 코드는 건드리지 않은 채로
	 * 확장을 통해서 새로운 행동을 간단하게 추가할 수 있어야 한다.
	 * 
	 * 무조건 OCP를 적용하는 것은 시간 낭비가 될 수 있고,
	 * 괜히 쓸 데 없는 일을 하는 것일 수도 있으므로 주의해야 한다.
	 */
	protected String description = "제목 없음";
	
	public String getDescription() {
		return this.description;
	}
	
	public abstract double cost();
}
