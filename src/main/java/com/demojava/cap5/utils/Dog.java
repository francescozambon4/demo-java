package com.demojava.cap5.utils;

/*
 * Create a class called Dog with an overloaded bark( ) method. This method should be 
 * overloaded based on various primitive data types, and print different types of 
 * barking, howling, etc., depending on which overloaded version is called. Write 
 * a main( ) that calls all the different versions.
 */

public class Dog {
	
	public void bark(){System.out.println("Silenzio");}
	public void bark(int i){System.out.println("Bau");}
	public void bark(short s){System.out.println("BauBau");}
	public void bark(byte b){System.out.println("BauBauuuuuuuuuuu");}
	public void bark(char c){System.out.println("Auuuuuuuuu");}
	public void bark(double d){System.out.println("AuuuAuuu");}
	public void bark(float f){System.out.println("SlurpSlurp");}
	public void bark(long l){System.out.println("RonfRonf");}
	
	/*
	 * Modify the previous exercise so that two of the overloaded methods have two 
	 * arguments (of two different types), but in reversed order relative to each 
	 * other. Verify that this works.
	 */
	
	public void bark(float f, long l){System.out.println("SlurpSlurpRonfRonf");}
	public void bark(long l, float f){System.out.println("RonfRonfSlurpSlurp");}
}
