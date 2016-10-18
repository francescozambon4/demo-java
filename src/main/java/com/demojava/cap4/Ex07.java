package com.demojava.cap4;
	
	/*
	 * Modify Exercise 1 so that the program exits by using the break keyword at value 99. Try using return instead.
	 */
public class Ex07 {

	public static void main(String args[] ){
		int i = 0;
		do{
			System.out.println(++i);
			if(i == 99) break;
		}while(true);
		
	}

}
