package com.demojava.cap5;

import com.demojava.cap5.utils.Ex02Test;

/*
	 * Create a class with a String field that is initialized at the point of definition, 
	 * and another one that is initialized by the constructor. What is the difference 
	 * between the two approaches?
	 */
public class Ex02 {

	public static void main(String[] args) {
		Ex02Test t = new Ex02Test();
		System.out.println("t.st1 = " + t.st1);
		System.out.println("t.st2 = " + t.st2);
		System.out.println("t.st3 = " + t.st3);
	}

}
