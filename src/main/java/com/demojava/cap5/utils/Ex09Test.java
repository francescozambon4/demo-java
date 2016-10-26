package com.demojava.cap5.utils;
	
	/*
	 * Create a class with two (overloaded) constructors. Using this, call the second 
	 * constructor inside the first one.
	 */
public class Ex09Test {
	public String st1;
		

	public Ex09Test(String s){
		st1 = s;
	}	
	
	public Ex09Test(){
		this("Ciao!");
	}
	
}
