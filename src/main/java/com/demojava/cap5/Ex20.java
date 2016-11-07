package com.demojava.cap5;
	/*
	 * Create a main( ) that uses varargs instead of the ordinary main( ) syntax. 
	 * Print all the elements in the resulting args array. Test it with various 
	 * numbers of command-line arguments.
	 */
public class Ex20 {

	public static void main(String ... args) {
		System.out.println("Metodo main(String ... args)");
		for(String S : args )
				System.out.println(S);

	}

}
