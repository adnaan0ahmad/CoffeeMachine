package com.java.coffeeMachine;

import com.java.coffee.Americano;
import com.java.coffee.CafeLatte;
import com.java.coffee.CafeMocha;
import com.java.coffee.Cappuccino;
import com.java.coffee.Coffee;
import com.java.coffee.Espresso;

public class CoffeeFactory {

	public static Coffee getCoffee(CoffeeMenu c, Ingredients i) {
		
		switch (c) {
		case ESPRESSO:
			return new Espresso(i.getCoffee(), i.getWater());
			
		case AMERICANO:
			return new Americano.AmericanoBuilder(i.getCoffee(), i.getWater()).setSugar(i.getSugar()).build();
			
		case CAPPUCCINO:
			return new Cappuccino.CappuccinoBuilder(i.getCoffee(), i.getWater()).setMilk(i.isMilk())
					.setSugar(i.getSugar()).setChocolateFlavour(i.isChocolateFlavour()).build();
			
		case CAFFE_MOCHA:
			return new CafeMocha.CafeMochaBuilder(i.getCoffee(), i.getWater()).setMilk(i.isMilk())
					.setSugar(i.getSugar()).setChocolateFlavour(i.isChocolateFlavour()).setCreme(i.isCreme()).build();
			
		case CAFFE_LATTE:
			return new CafeLatte.CafeLatteBuilder(i.getCoffee(), i.getWater()).setMilk(i.isMilk())
					.setSugar(i.getSugar()).setCreme(i.isCreme()).build();
			

		default:
			return null;
		
	}

}
}
