package com.demojava.cap3;

import com.demojava.cap3.utils.*;
	/*
	 * Create a class called Dog containing two Strings: name and says. In main( ), * create 
	 * two dog objects with names “spot” (who says, “Ruff!”) and “scruffy” (who says, “Wurf!”). 
	 * Then display their names and what they say.
	 */


public class Ex05 {

	public static void main(String[] args) {
		Dog spot = new Dog();
		Dog scruffy = new Dog();
		
		spot.setName("Spot");
		spot.setSays("Ruff!");
		
		scruffy.setName("Scruffy");
		scruffy.setSays("Wurf!");
		
		System.out.print("Il primo cane si chiama "); 
		spot.showName(); 
		System.out.print("e dice: ");
		spot.speak();

		System.out.print("Il secondo cane si chiama "); 
		scruffy.showName(); 
		System.out.print("e dice: ");
		scruffy.speak();
	}

}
