package com.demojava.cap3;

	/*
	 * Start with a number that has a binary one in the most significant position (hint: Use a 
	 * hexadecimal constant). * Using the signed right-shift operator, right shift it all the 
	 * way through all of its binary positions, each time displaying the result using 
	 * Integer.toBinaryString( ).
	 */

public class Ex11 {

	public static void main(String[] args) {
		int n = 0x80000000;
		System.out.println("n = \t\t" + Integer.toBinaryString(n));
		for(int i = 0; i < 32; i++)
			System.out.println("n >> " + i + " = \t" + Integer.toBinaryString(n >> i));
	}

}
