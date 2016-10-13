package com.demojava.cap3;

	/*
	 * Start with a number that is all binary ones. Left shift it, then use the unsigned 
	 * right-shift operator to right shift through all of its binary positions, each time 
	 * displaying the result using Integer.toBinaryString( ).
	 */

public class Ex12 {
	public static void main(String[] args) {
		int n = 0xFFFFFFFF;
		System.out.println("n = \t\t" + Integer.toBinaryString(n));
		for(int i = 0; i < 32; i++)
			System.out.println("n >>> " + i + " = \t" + Integer.toBinaryString(n >>> i));
	}
}
