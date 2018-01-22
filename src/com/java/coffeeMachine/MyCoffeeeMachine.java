package com.java.coffeeMachine;

import java.util.Scanner;

import com.java.coffee.Coffee;

public class MyCoffeeeMachine {

	
	public static void main(String[] args) throws InterruptedException {

		Ingredients ingredients = Ingredients.getIngredients();
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the type of Coffee you want me to serve you !!");
		System.out.println("	1. ESPRESSO (Thick Black Coffee)\r\n" + "	2. AMERICANO (Normal Black Coffee)\r\n"
				+ "	3. CAPPUCCINO (Standard coffee)\r\n" + "	4. CAFFE_LATTE (Coffee with milk)\r\n"
				+ "	5. CAFFE_MOCHA (Creamy Coffee)");

		System.out.println("Enter your choice: ");

		int i = sc.nextInt();

			switch (i) {

			case 1: 
				ingredients.setCoffee(75);
				ingredients.setWater(25);
				
				Coffee espresso = CoffeeFactory.getCoffee(CoffeeMenu.ESPRESSO, ingredients);

				System.out.println("Serving Espresso coffee...!!");
				Thread.sleep(5000);
				System.out.println(espresso);

				break;
			

			case 2: 
				ingredients.setCoffee(60);
				ingredients.setWater(40);
				ingredients.setSugar(CoffeeUtil.sugarChooser(sc));
				
				Coffee americano = CoffeeFactory.getCoffee(CoffeeMenu.AMERICANO, ingredients);

				System.out.println("Serving Americano coffee...!!");
				Thread.sleep(5000);
				System.out.println(americano);

				break;
			

			case 3: 

				ingredients.setCoffee(50);
				ingredients.setWater(20);
				ingredients.setMilk(true);
				ingredients.setSugar(CoffeeUtil.sugarChooser(sc));				
				ingredients.setChocolateFlavour(CoffeeUtil.chocolateFlavourChooser(sc));
				
				
				Coffee cappuccino = CoffeeFactory.getCoffee(CoffeeMenu.CAPPUCCINO, ingredients);

				System.out.println("Serving Cappuccino coffee...!!");
				Thread.sleep(5000);
				System.out.println(cappuccino);
			
				break;
			

			case 4: 

				ingredients.setCoffee(50);
				ingredients.setWater(20);
				ingredients.setMilk(true);
				ingredients.setSugar(CoffeeUtil.sugarChooser(sc));				
				ingredients.setCreme(CoffeeUtil.cremeChooser(sc));
				
				Coffee cl = CoffeeFactory.getCoffee(CoffeeMenu.CAFFE_LATTE, ingredients);

				System.out.println("Serving Latte coffee...!!");
				Thread.sleep(5000);
				System.out.println(cl);
				break;
			

			case 5: 
				
				ingredients.setCoffee(50);
				ingredients.setWater(20);
				ingredients.setMilk(true);
				ingredients.setSugar(CoffeeUtil.sugarChooser(sc));				
				ingredients.setChocolateFlavour(CoffeeUtil.chocolateFlavourChooser(sc));
				ingredients.setCreme(CoffeeUtil.cremeChooser(sc));
				
				Coffee cm = CoffeeFactory.getCoffee(CoffeeMenu.CAFFE_MOCHA, ingredients);

				System.out.println("Serving Mocha coffee...!!");
				Thread.sleep(5000);
				System.out.println(cm);

				break;
			

			default:
				System.out.println("Please enter a valid choice");
				break;
			}
		}
	
	

	

	}





