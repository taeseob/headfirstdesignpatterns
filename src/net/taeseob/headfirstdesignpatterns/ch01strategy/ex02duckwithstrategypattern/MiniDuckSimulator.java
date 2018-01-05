package net.taeseob.headfirstdesignpatterns.ch01strategy.ex02duckwithstrategypattern;

import net.taeseob.headfirstdesignpatterns.ch01strategy.ex02duckwithstrategypattern.duck.Duck;
import net.taeseob.headfirstdesignpatterns.ch01strategy.ex02duckwithstrategypattern.duck.ext.MallardDuck;
import net.taeseob.headfirstdesignpatterns.ch01strategy.ex02duckwithstrategypattern.duck.ext.ModelDuck;
import net.taeseob.headfirstdesignpatterns.ch01strategy.ex02duckwithstrategypattern.fly.impl.FlyRocketPowered;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		
		/* 실행중에 동적으로 나는 행동을 바꿀 수 있다.
		 * 만약 구현 코드가 Duck 클래스 안에 들어 있었다면
		 * 이렇게 할 수 없었을 것이다.
		 */
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
