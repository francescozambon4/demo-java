package com.demojava.cap5;

import com.demojava.cap5.utils.Ex10Test;

/*
	 * Create a class with a finalize( ) method that prints a message. In main( ), 
	 * create an object of your class. Explain the behavior of your program.
	 */

public class Ex10 {

	public static void main(String[] args) {
		Ex10Test t = new Ex10Test();
		t.setSt("test");
		
		new Ex10Test("");
		System.gc();

	}

}
