package com.demojava.cap5;

import com.demojava.cap5.utils.Banconote.Banconota;

	/*
	 * Create an enum of the least-valuable six types of paper currency. Loop through the 
	 * values( ) and print each value and its ordinal( ).
	 */
public class Ex21 {

	public static void main(String[] args) {
		
		for( Banconota b : Banconota.values())
			 System.out.println(b + ", ordinale " + b.ordinal());

	}

}
