package com.demojava.cap5.utils;

	/*
	 * Create a class with two methods. Within the first method, call the second method 
	 * twice: the first time without using this, and the second time using this—just to 
	 * see it working; you should not use this form in practice.
	 */

public class Ex08Test {
	String s = "Test";
	
	public void f1(){
		f2();
		this.f2();
	}
	
	public void f2(){
		System.out.println(s);
	}
}
