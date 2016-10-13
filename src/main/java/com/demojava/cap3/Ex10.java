package com.demojava.cap3;

public class Ex10 {
	/*
	 * Write a program with two constant values, one with alternating binary ones and zeroes, 
	 * with a zero in the least-significant digit, and the second, also alternating, with a 
	 * one in the least-significant digit (hint: It’s easiest to use hexadecimal constants for 
	 * this). Take these two values and combine them in all possible ways using the bitwise 
	 * operators, and display the results using Integer.toBinaryString( ).
	 */
	public static void main(String[] args) {
		int n1 = 0xAAAAAAAA;
		int n2 = 0x55555555;
		
		System.out.println("n1 = " +  Integer.toBinaryString(n1));
		System.out.println("n2 = " + Integer.toBinaryString(n2));
		System.out.println("n1 & n2 = " + Integer.toBinaryString(n2&n1));
		System.out.println("n1 | n2 = " + Integer.toBinaryString(n2|n1));
		System.out.println("n1 ^ n2 = " + Integer.toBinaryString(n2^n1));
		System.out.println("~n1 = " + Integer.toBinaryString(~n1));
		System.out.println("~n2 = " + Integer.toBinaryString(~n2));
	}

}
