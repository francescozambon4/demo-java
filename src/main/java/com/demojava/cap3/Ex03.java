package com.demojava.cap3;

import com.demojava.cap3.utils.AliasingTest;

	/*
	 * Create a class containing a float and use it to demonstrate aliasing during method calls.
	 */
public class Ex03 {

	public static void main(String[] args) {
		AliasingTest t = new AliasingTest();
		t.aliasing = 10155.444f;
		
		System.out.println("t.aliasing = " + t);
		
		
		AliasingTest.f(t);
		
		System.out.println("t.aliasing dopo f(t). t.aliasing = " + t);
		

	}

}
