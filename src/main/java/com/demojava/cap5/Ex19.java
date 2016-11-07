package com.demojava.cap5;
	/*
	 * Write a method that takes a vararg String array. Verify that you can pass 
	 * either a comma-separated list of Strings or a String[] into this method.
	 */
public class Ex19 {
	static void Ex19test(String ... args){
		System.out.println("Metodo Ex19Test, numero di stringhe: " + args.length );	
		for (String s : args){
				System.out.println(s);
			}
			}
	public static void main(String[] args) {
		System.out.println("passo valori separati da virgola");
		Ex19test("Uno", "Due", "Tre", "Quattro", "Cinque");
		
		System.out.println("passo valori in un array");
		String S[] = {"Uno", "Due", "Tre", "Quattro", "Cinque"}; 
		Ex19test(S);
	}

}
