package com.java.coffee;


public class CafeMocha extends Coffee {
	
	int coffee;
	int water;
	boolean milk;
	int sugar;
	boolean chocolateFlavour;
	boolean creme;

	@Override
	public String toString() {
		return "CafeMocha [coffee=" + coffee + "gms, water=" + water + "ml, milk=" + milk + ", sugar=" + sugar
				+ "cubes, chocolateFlavour=" + chocolateFlavour + ", creme=" + creme + "]";
	}

	public CafeMocha(CafeMochaBuilder cb) {
		super();
		this.coffee = cb.coffee;
		this.water = cb.water;
		this.milk = cb.milk;
		this.sugar = cb.sugar;
		this.chocolateFlavour = cb.chocolateFlavour;
		this.creme = cb.creme;
	}

	public static class CafeMochaBuilder{
		
		int coffee;
		int water;
		boolean milk;
		int sugar;
		boolean chocolateFlavour;
		boolean creme;
		
		public CafeMochaBuilder(int coffee, int water) {
			super();
			this.coffee = coffee;
			this.water = water;
		}

		public CafeMochaBuilder setMilk(boolean milk) {
			this.milk = milk;
			return this;
		}

		public CafeMochaBuilder setSugar(int sugar) {
			this.sugar = sugar;
			return this;
		}

		public CafeMochaBuilder setChocolateFlavour(boolean chocolateFlavour) {
			this.chocolateFlavour = chocolateFlavour;
			return this;
		}
		
		public CafeMochaBuilder setCreme(boolean creme) {
			this.creme = creme;
			return this;
		}

		public CafeMocha build() {
			return new CafeMocha(this);
		}
		
		
		
	}

}
