package com.demojava.cap5;

import com.demojava.cap5.utils.Ex10Test;

/*	
	 * Modify the previous exercise so that your finalize( ) will always be called.
	 */
public class Ex11 {

	public static void main(String[] args) {
		Ex10Test t1 = new Ex10Test("Test1");
		Ex10Test t2 = new Ex10Test("Test 2");
		new Ex10Test("Test");
		
		t1.setSt("");
		System.out.println("Prova 1: "); 
		System.runFinalization();
		System.out.println("Prova 2: "); 	
		Runtime.getRuntime().runFinalization();
		System.out.println("Prova 3: "); 
		System.gc();
		System.out.println("Prova 4: ");
		// using deprecated since 1.1 method:
		System.runFinalizersOnExit(true);	
	}

}
