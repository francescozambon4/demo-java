package com.demojava.cap3;
	/*	
	 * Display the largest and smallest numbers for both float and double exponential notation.
	 */

public class Ex09 {

	public static void main(String[] args) {
		float f_max = Float.MAX_VALUE;
		float f_min = Float.MIN_VALUE;
		double d_max = Double.MAX_VALUE;
		double d_min = Double.MIN_VALUE;
		
		System.out.println("Numero float minimo =" + f_min);
		System.out.println("Numero float massimo =" + f_max);
		
		System.out.println("Numero double minimo =" + d_min);
		System.out.println("Numero double massimo =" + d_max);

	}

}
