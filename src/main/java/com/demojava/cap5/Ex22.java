package com.demojava.cap5;

import com.demojava.cap5.utils.Banconote.Banconota;
	/*
	 * Write a switch statement for the enum in the previous example. For each case, 
	 * output a description of that particular currency.
	 */

public class Ex22 {

	public static void main(String[] args) {
		
		for( Banconota b : Banconota.values()){
			System.out.print("Valore: ");
			switch (b) {
			case CINQUE: System.out.println("€ 5");break;
			case DIECI: System.out.println("€ 10");break;
			case VENTI: System.out.println("€ 20");break;
			case CINQUANTA: System.out.println("€ 50");break;
			case CENTO: System.out.println("€ 100");break;
			case DUECENTO: System.out.println("€ 200");break;
			case CINQUECENTO: System.out.println("€ 500");break;
			default: break;
			}
			 }
	}

}
