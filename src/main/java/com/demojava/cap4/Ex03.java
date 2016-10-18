package com.demojava.cap4;

import java.util.Random;

/*
	 * Modify Exercise 2 so that your code is surrounded by an “infinite” while loop. 
	 * It will then run until you interrupt it from the keyboard (typically by pressing Control-C).
	 */
public class Ex03 {

	public static void main(String[] args) {
		int n1, n2;
		Random r = new Random();
		
		while(true){
			n1 = r.nextInt();
			n2 = r.nextInt();
			if( n1 < n2 ) 
				System.out.println(n1 + " è minore di " + n2);
			else if( n1 > n2) 
				System.out.println(n1 + " è maggiore di " + n2);
			else 
				System.out.println( n1 + " è uguale a " + n2);
		}


	}

}
