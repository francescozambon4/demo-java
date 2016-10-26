package com.demojava.cap5.utils;
	/*
	 * Create a class called Tank that can be filled and emptied, and has a termination 
	 * condition that it must be empty when the object is cleaned up. Write a finalize( ) 
	 * that verifies this termination condition. In main( ), test the possible scenarios 
	 * that can occur when your Tank is used.
	 */
public class Tank {
	
	public int qnt = 0;
	
	public Tank(){
		this(0);
	}
	public Tank(int qnt){
		this.qnt = qnt;
	}
	
	public void empty(){
		qnt = 0;
	}
	
	public void howIsFull(){
		if(qnt == 0) 
			System.out.println("Tank is empty");
		else System.out.println("Tank filling status = " + qnt);
	}
	
	protected void finalize(){
		if(qnt != 0)
			System.out.println("Error: The tank is not empty");
	}
}
