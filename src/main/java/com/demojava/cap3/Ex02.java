package com.demojava.cap3;
import com.demojava.cap3.utils.*;

	/*
	 * Create a class containing a float and use it to demonstrate aliasing.
	 */

public class Ex02 {

	public static void main(String[] args) {
		AliasingTest t1 = new AliasingTest();
		AliasingTest t2 = new AliasingTest();
		
		t1.aliasing = 10.0f;
		t2.aliasing = 22.0f;

		// stampo  i valori di t1 e t2
		System.out.println("t1.aliasing = " + t1 + " t2.aliasing = " + t2);
		
		// assegno a t1 il riferimento di t2
		t1 = t2;

		// stampo il valore di t1 dopo l'assegnazione 
		System.out.println("t1 dopo assegnazione di t1 = t2, t1.aliasing = " + t1 );
		
		//modifico il valore di t2
		t2.aliasing = 55.0f;
		
		// stampo il valore di t1
		System.out.println("t1 dopo t2.aliasing = 55.0f, t1.aliasing = " + t1);

	}

}
