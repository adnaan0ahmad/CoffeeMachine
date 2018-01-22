package com.java.coffeeMachine;

public class Ingredients {
	
	private int coffee;
	private int water;
	
	private boolean milk;
	private int sugar;
	private boolean chocolateFlavour;
	private boolean creme;
	
	private static Ingredients i = null;

	private Ingredients() {	}

	public static Ingredients getIngredients() {
		
		if(i == null)
			i = new Ingredients();
		
		return i;
	}

	public int getCoffee() {
		return coffee;
	}

	public void setCoffee(int coffee) {
		this.coffee = coffee;
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public boolean isMilk() {
		return milk;
	}

	public void setMilk(boolean milk) {
		this.milk = milk;
	}

	public int getSugar() {
		return sugar;
	}

	public void setSugar(int sugar) {
		this.sugar = sugar;
	}

	public boolean isChocolateFlavour() {
		return chocolateFlavour;
	}

	public void setChocolateFlavour(boolean chocolateFlavour) {
		this.chocolateFlavour = chocolateFlavour;
	}

	public boolean isCreme() {
		return creme;
	}

	public void setCreme(boolean creme) {
		this.creme = creme;
	}

	public static Ingredients getI() {
		return i;
	}

	public static void setI(Ingredients i) {
		Ingredients.i = i;
	}

	@Override
	public String toString() {
		return "Ingredients [coffee=" + coffee + ", water=" + water + ", milk=" + milk + ", sugar=" + sugar
				+ ", chocolateFlavour=" + chocolateFlavour + ", creme=" + creme + "]";
	}
	
	
	
	
	
	
	
	
}
