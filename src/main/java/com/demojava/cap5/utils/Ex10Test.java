package com.demojava.cap5.utils;
	/*
	 * Create a class with a finalize( ) method that prints a message. In main( ), 
	 * create an object of your class. Explain the behavior of your program.
	 */
public class Ex10Test {
	
	private String st = "";
	
	public Ex10Test(){}
	
	public Ex10Test(String s){
		st = s;
	}
		
	public void setSt(String s){
		st = s;
	}
	
	public String getSt(){
		return st;
		
	}
	
	protected void finalize(){
		if(st.equals(""))
		System.out.println("ERRORE");
		
	}
}
