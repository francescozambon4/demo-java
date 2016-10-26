package com.demojava.cap5;
	/*	
	 * Create an array of String objects and assign a String to each element. Print the array by using a for loop.
	 */
public class Ex16 {

	public static void main(String[] args) {
		String[] S = { "Zero", "Uno", "Due", "Tre", "Quattro", "Cinque"};
		for(int i = 0; i < S.length; i++)
			System.out.println(S[i]);
	}

}
