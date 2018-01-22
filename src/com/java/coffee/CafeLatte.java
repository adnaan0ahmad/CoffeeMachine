package com.java.coffee;

public class CafeLatte extends Coffee {

	int coffee;
	int water;
	boolean milk;
	int sugar;
	boolean creme;

	public CafeLatte(CafeLatteBuilder cb) {
		super();
		this.coffee = cb.coffee;
		this.water = cb.water;
		this.milk = cb.milk;
		this.sugar = cb.sugar;
		this.creme = cb.creme;
	}
	
	

	@Override
	public String toString() {
		return "CafeLatte [coffee=" + coffee + "gms, water=" + water + "ml, milk=" + milk + ", sugar=" + sugar + "cubes, creme="
				+ creme + "]";
	}



	public static class CafeLatteBuilder {

		int coffee;
		int water;
		boolean milk;
		int sugar;
		boolean creme;

		public CafeLatteBuilder(int coffee, int water) {
			super();
			this.coffee = coffee;
			this.water = water;
		}

		public CafeLatteBuilder setMilk(boolean milk) {
			this.milk = milk;
			return this;
		}

		public CafeLatteBuilder setSugar(int sugar) {
			this.sugar = sugar;
			return this;
		}

		public CafeLatteBuilder setCreme(boolean creme) {
			this.creme = creme;
			return this;
		}

		public CafeLatte build() {
			return new CafeLatte(this);
		}

	}
}
