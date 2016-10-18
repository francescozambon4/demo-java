package com.demojava.cap4;
	/*
	 * Write a program that uses two nested for loops and the modulus operator (%) to detect 
	 * and print prime numbers (integral numbers that are not evenly divisible by any other 
	 * numbers except for themselves and 1).
	 */
public class Ex04 {

	public static void main(String[] args) {
		int div  = 0;
		for(int i = 1; i <= 100; i++){
			for(int j = 1 ; j <=  i; j++)
				if( i%j == 0) div++;
			if(div == 2)
				System.out.println(i + " è primo");
			div = 0;
		}

	}

}
