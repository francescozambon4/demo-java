package com.demojava.cap2;

import com.demojava.cap2.utils.*;

public class Ex07 {
	
	/*
	 * Turn the Incrementable code fragments into a working program.
	 */
	
	public static void main(String[] args) {
			System.out.println("StaticTest.i= " + StaticTest.i);
			StaticTest st1 = new StaticTest();
			StaticTest st2 = new StaticTest();
			System.out.println("st1.i= " + st1.i);
			System.out.println("st2.i= " + st2.i);
			Incrementable sf = new Incrementable();
			sf.increment();
			System.out.println("Dopo sf.increment() called: ");
			System.out.println("st1.i = " + st1.i);
			System.out.println("st2.i = " + st2.i);
			Incrementable.increment();
			System.out.println("Dopo Incrementable.increment chiamato: ");
			System.out.println("st1.i = " + st1.i);
			System.out.println("st2.i = " + st2.i);

	}

}
