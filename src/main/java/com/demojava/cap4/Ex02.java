package com.demojava.cap4;

import java.util.Random;

/*
	 * Write a program that generates 25 random int values. For each value, use an if-else 
	 * statement to classify it as greater than, less than, or equal to a second randomly 
	 * generated value.
	 */

public class Ex02 {

	public static void main(String[] args) {
		int n1, n2;
		Random r = new Random();
		
		for(int i = 0; i < 25; i++){
			n1 = r.nextInt();
			n2 = r.nextInt();
			if( n1 < n2 ) 
				System.out.println(n1 + " è minore di " + n2);
			else if( n1 > n2) 
				System.out.println(n1 + " è maggiore di " + n2);
			else 
				System.out.println( n1 + " è uguale a " + n2);
		}

	}

}
