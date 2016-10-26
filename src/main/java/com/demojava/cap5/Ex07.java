package com.demojava.cap5;

import com.demojava.cap5.utils.Ex07Test;

/*
	 * Create a class without a constructor, and then create an object of that class 
	 * in main( ) to verify that the default constructor is automatically synthesized.
	 */
public class Ex07 {

	public static void main(String[] args) {
		Ex07Test t = new Ex07Test();
		
		System.out.println(t.getS());
	}

}
