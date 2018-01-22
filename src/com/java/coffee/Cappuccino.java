package com.java.coffee;

public class Cappuccino extends Coffee {
	
	int coffee;
	int water;
	boolean milk;
	int sugar;
	boolean chocolateFlavour;
	
	@Override
	public String toString() {
		return "Cappuccino [coffee=" + coffee + "gms, water=" + water + "ml, milk=" + milk + ", sugar=" + sugar
				+ "cubes, chocolateFlavour=" + chocolateFlavour + "]";
	}

	public Cappuccino(CappuccinoBuilder cb) {
		super();
		this.coffee = cb.coffee;
		this.water = cb.water;
		this.milk = cb.milk;
		this.sugar = cb.sugar;
		this.chocolateFlavour = cb.chocolateFlavour;
	}

	public static class CappuccinoBuilder{
		
		int coffee;
		int water;
		boolean milk;
		int sugar;
		boolean chocolateFlavour;
		
		public CappuccinoBuilder(int coffee, int water) {
			super();
			this.coffee = coffee;
			this.water = water;
		}

		public CappuccinoBuilder setMilk(boolean milk) {
			this.milk = milk;
			return this;
		}

		public CappuccinoBuilder setSugar(int sugar) {
			this.sugar = sugar;
			return this;
		}

		public CappuccinoBuilder setChocolateFlavour(boolean chocolateFlavour) {
			this.chocolateFlavour = chocolateFlavour;
			return this;
		}
		
		public Cappuccino build() {
			return new Cappuccino(this);
		}
		
		
		
	}
	
}
