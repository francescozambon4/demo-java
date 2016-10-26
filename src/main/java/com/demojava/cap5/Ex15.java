package com.demojava.cap5;
	/*
	 * Create a class with a String that is initialized using instance initialization.
	 */
public class Ex15 {
	String S1;
	{
		S1 = "Inizializzazione";
		System.out.println("Stringa S1 = " + S1);
	}
	
	Ex15(){
		System.out.println("Ex15()");
	}
	
	
	public static void main(String[] args) {
		System.out.println("Inside main()");
		new Ex15();
		System.out.println("new Ex15() completed");
	}

}
