package com.demojava.cap5;

import com.demojava.cap5.utils.Ex08Test;

	/*
	 * Create a class with two methods. Within the first method, call the second method 
	 * twice: the first time without using this, and the second time using this—just to 
	 * see it working; you should not use this form in practice.
	 */
public class Ex08 {

	public static void main(String[] args) {
		
		(new Ex08Test()).f1();

	}

}
