package com.demojava.cap3;

import com.demojava.cap3.utils.*;
		/*
		 * Following Exercise 5, create a new Dog reference and assign it to spot’s object. 
		 * Test for comparison using == and equals( ) for all references.
		 */


public class Ex06 {

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
		
		Dog bobby = new Dog();
		
		bobby.setName("Bobby");
		bobby.setSays("Hi!");
		
		System.out.print("Il terzo cane si chiama "); 
		bobby.showName(); 
		System.out.print("e dice: ");
		bobby.speak();
		
		System.out.println("Comparazione tra Spot e Bobby:");
		System.out.println("spot == bobby: " + (spot == bobby));
		System.out.println("spot.equals(bobby): " + spot.equals(bobby));
		System.out.println("bobby.equals(spot): " + bobby.equals(spot));
		
		spot = bobby;
		System.out.println("Comparazione dopo spot = bobby:");
		System.out.println("spot == bobby: " + (spot == bobby));
		System.out.println("spot.equals(bobby): " + spot.equals(bobby));
		System.out.println("bobby.equals(spot): " + bobby.equals(spot));


	}

}
