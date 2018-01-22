package com.java.coffeeMachine;

import java.util.Scanner;

public class CoffeeUtil {
	
	public static boolean milkChooser(Scanner sc) {
		System.out.println("Do you want me to add milk? \t Y or N : ");
		String c = sc.next();
		if (c.equalsIgnoreCase("y")) {
			return true;
		}
		return false;
	}
	
	public static int sugarChooser(Scanner sc) {
		System.out.println("Do you want me to add sugar? \t Y or N : ");
		String c = sc.next();
		if (c.equalsIgnoreCase("y")) {
			System.out.println("How many cubes of sugar?: ");
			return sc.nextInt();
		}
		return 0;
	}
	
	public static boolean chocolateFlavourChooser(Scanner sc) {
		System.out.println("Do you want me to add chocolate flavour? \t Y or N : ");
		String c = sc.next();
		if (c.equalsIgnoreCase("y")) {
			return true;
		}
		return false;
	}
	
	public static boolean cremeChooser(Scanner sc) {
		System.out.println("Do you want me to add creme? \t Y or N : ");
		String c = sc.next();
		if (c.equalsIgnoreCase("y")) {
			return true;
		}
		return false;
	}

}
