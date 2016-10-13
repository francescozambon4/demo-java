package com.demojava.cap3;
	/*
	 * Show that hex and octal notations work with long values. Use Long.toBinaryString( ) to display the results.
	 */

public class Ex08 {

	public static void main(String[] args) {
		long n1 = 0xf0f0f0;
		long n2 = 070707070;
		
		System.out.println("long n1 in hex = " +  Long.toBinaryString(n1));
		System.out.println("long n2 in oct = " +  Long.toBinaryString(n2));

	}

}
