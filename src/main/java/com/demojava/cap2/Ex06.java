package com.demojava.cap2;

import com.demojava.cap2.utils.*;

public class Ex06 {
	
	/*
	 * Write a program that includes and calls the storage( ) method defined as a code fragment in this chapter
	 */
	
	public static void main(String[] args) {
		StorageTest st = new StorageTest();
		
		System.out.println("Hello occupies " + st.storage("Hello") + " bytes"); 
		System.out.println(st);

	}

}
