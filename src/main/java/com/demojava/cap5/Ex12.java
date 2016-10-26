package com.demojava.cap5;

import com.demojava.cap5.utils.Tank;

	/*
	 * Create a class called Tank that can be filled and emptied, and has a termination 
	 * condition that it must be empty when the object is cleaned up. Write a finalize( ) 
	 * that verifies this termination condition. In main( ), test the possible scenarios 
	 * that can occur when your Tank is used.
	 */

public class Ex12 {
	public static void main(String args[] ){
		 Tank t1 = new Tank();
		 Tank t2 = new Tank(100);
		 Tank t3 = new Tank(50);
		
		 t2.empty();
		 new Tank(25);
		 System.out.println("Quantity of tanks:");
		 System.out.println("Tank t1:");
		 t1.howIsFull();
		 System.out.println("Tank t2:");
		 t2.howIsFull();
		 System.out.println("Tank t3:");
		 t3.howIsFull();
		 // primo garbage collector forzato
		 System.out.println("first forced gc():");
		 System.gc();
		// Forzo finalizzazione in uscita utilizzando il metodo deprecato dalla jdk 1.1:
		System.out.println("try deprecated runFinalizersOnExit(true):");
		System.runFinalizersOnExit(true);
		System.out.println("last forced gc():");
		System.gc();
		 
	}
}
