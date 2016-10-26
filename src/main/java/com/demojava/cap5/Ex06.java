package com.demojava.cap5;
import com.demojava.cap5.utils.*;
	/*
	 * Modify the previous exercise so that two of the overloaded methods have two 
	 * arguments (of two different types), but in reversed order relative to each 
	 * other. Verify that this works.
	 */

public class Ex06 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.bark();
		dog.bark('c');
		dog.bark(10);
		dog.bark(10.0);
		dog.bark(10.0f);
		dog.bark(10L);
		dog.bark((byte) 10);
		dog.bark((short) 10);
		
		dog.bark(10.0f, 10L);
		dog.bark(10L, 10.0f);
	}

}
