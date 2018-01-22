package com.java.coffee;

public class Espresso extends Coffee {
	
	int coffee;
	int water;
	public Espresso(int coffee, int water) {
		super();
		this.coffee = coffee;
		this.water = water;
	}
	@Override
	public String toString() {
		return "Espresso [coffee=" + coffee + "gms, water=" + water + "ml]";
	}

	
	
	

}
