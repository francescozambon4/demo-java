package com.demojava.cap3;
	/*
	 * Write a method that takes two String arguments and uses all the boolean comparisons 
	 * to compare the two Strings and print the results. For the == and !=, also perform the 
	 * equals( ) test. In main( ), call your method with some different String objects.
	 */
public class Ex14 {

	public static void main(String[] args) {
		String x = "One", y = "Two";
		
		System.out.println("x == y => " + (x == y) );
		System.out.println("x.equals(y) => " + (x.equals(y)) );
		System.out.println("y.equals(x) => " + (y.equals(x)) );
		System.out.println("x != y => " + (x != y) );
		
		
	}

}
