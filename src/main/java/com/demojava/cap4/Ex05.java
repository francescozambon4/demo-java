package com.demojava.cap4;
	/*
	 * Repeat Exercise 10 from the previous chapter, using the ternary operator and 
	 * a bitwise test to display the ones and zeroes, instead of Integer.toBinaryString( ).
	 */
public class Ex05 {

	public static void main(String[] args) {
		int n1 = 0xAAAAAAAA;
		int n2 = 0x55555555;
		
		System.out.print("n1 = "); 
		binaryPrint(n1);
		System.out.print("n2 = "); 
		binaryPrint(n2);
		System.out.print("n1 & n2 = "); 
		binaryPrint(n2&n1);
		System.out.print("n1 | n2 = "); 
		binaryPrint(n2|n1);
		System.out.print("n1 ^ n2 = "); 
		binaryPrint(n2^n1);
		System.out.print("~n1 = "); 
		binaryPrint(~n1);
		System.out.print("~n2 = "); 
		binaryPrint(~n2);
	}

	

	static void binaryPrint(int q){
		if(q == 0)
			System.out.print(0);
		else{
			//numero di zeri prima del bit a 1 più significativo
			int nrz = Integer.numberOfLeadingZeros(q);
			q <<= nrz;
			for(int p = 0; p < 32- nrz; p++){
				System.out.print((Integer.numberOfLeadingZeros(q) != 0 ? 0 : 1));
				q <<= 1;
			}
		}
		System.out.println("");
	}
}
