package com.demojava.cap4;
	/*
	 * Create a switch statement that prints a message for each case, and put the switch inside 
	 * a for loop that tries each case. Put a break after each case and test it, then remove the 
	 * breaks and see what happens.
	 */
public class Ex08 {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++)
			switch(i){
			case 1: System.out.println("Case 1");
					break;
			case 2:	System.out.println("Case 2");
					break;
			case 3:	System.out.println("Case 3");
					break;
			case 4:	System.out.println("Case 4");
					break;
			default: System.out.println("Default Case");
			}

	}

}
