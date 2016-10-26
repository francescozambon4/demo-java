package com.demojava.cap5;

import com.demojava.cap5.utils.Ex09Test;

import net.mindview.util.New;

/*
	 * Create a class with two (overloaded) constructors. Using this, 
	 * call the second constructor inside the first one.
	 */
public class Ex09 {

	public static void main(String[] args) {
		Ex09Test t1 = new Ex09Test();
		Ex09Test t2 = new Ex09Test("Buongiorno");
		
		System.out.println(t1.st1);
		System.out.println(t2.st1);

	}

}
