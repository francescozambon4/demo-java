package com.demojava.cap5;
import com.demojava.cap5.utils.*;
	/*
	 * Create a class called Dog with an overloaded bark( ) method. This method should be 
	 * overloaded based on various primitive data types, and print different types of 
	 * barking, howling, etc., depending on which overloaded version is called. Write 
	 * a main( ) that calls all the different versions.
	 */

public class Ex05 {

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
	}

}
