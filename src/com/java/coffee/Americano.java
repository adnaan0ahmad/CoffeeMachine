package com.java.coffee;


public class Americano extends Coffee{
	
	int coffee;
	int water;
	int sugar;
	
	
	public Americano(AmericanoBuilder cb) {
		super();
		this.coffee = cb.coffee;
		this.water = cb.water;
		this.sugar = cb.sugar;
	}
	
	

	@Override
	public String toString() {
		return "Americano [coffee=" + coffee + "gms, water=" + water + "ml, sugar=" + sugar + "cubes]";
	}



	public static class AmericanoBuilder{
		
		int coffee;
		int water;
		int sugar;
		
		public AmericanoBuilder(int coffee, int water) {
			super();
			this.coffee = coffee;
			this.water = water;
		}


		public AmericanoBuilder setSugar(int sugar) {
			this.sugar = sugar;
			return this;
		}


		public Americano build() {
			return new Americano(this);
		}
		
		
		
	}

}
