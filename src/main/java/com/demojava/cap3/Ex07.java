package com.demojava.cap3;

import java.util.Random;

	/*
	 * Write a program that simulates coin-flipping.
	 */

public class Ex07 {

	public static void main(String[] args) {
		Random r = new Random();
		
		if(r.nextInt()%2 == 0)
			System.out.println("Testa");
		else System.out.println("Croce");
		

	}

}
