package com.demojava.cap2;

import com.demojava.cap2.utils.*;

public class Ex08 {
	
	/*
	 * Write a program that demonstrates that, no matter how many objects you create of a 
	 * particular class, there is only one instance of a particular static field in that class.
	 */
	
	public static void main(String[] args) {
			System.out.println("Variabile statica \nStaticTest.i= " + StaticTest.i);
			
			StaticTest st1 = new StaticTest();
			StaticTest st2 = new StaticTest();
			StaticTest st3 = new StaticTest();
			Incrementable sf = new Incrementable();
			
			System.out.println("valori attuali delle variabili i per i tre oggetti");
			System.out.println("st1.i= " + st1.i);
			System.out.println("st2.i= " + st2.i);
			System.out.println("st2.i= " + st3.i);
			sf.increment();
			System.out.println("Dopo la chiamata di sf.increment(): ");
			System.out.println("st1.i = " + st1.i);
			System.out.println("st2.i = " + st2.i);
			System.out.println("st2.i = " + st3.i);
			st1.i = st2.i + 6;
			System.out.println("Dopo st1.i = st2.i + 6: ");
			System.out.println("st1.i = " + st1.i);
			System.out.println("st2.i = " + st2.i);
			System.out.println("st2.i = " + st3.i);
			st1.i = st2.i - 21;
			System.out.println("Dopo st1.i = st2.i - 21: ");
			System.out.println("st1.i = " + st1.i);
			System.out.println("st2.i = " + st2.i);
			System.out.println("st2.i = " + st3.i);
	}

}
