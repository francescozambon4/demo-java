package com.demojava.cap2;

public class Ex09 {

	/*
	 * Write a program that demonstrates that autoboxing works for all the primitive types and their wrappers.
	 */
	public static void main(String[] args) {
		int i = 10;
		double d = 100.0;
		byte by = 15;
		short s = 105;
		long l = 100000L;
		float f = 15.05f;
		char c = '#';
		boolean b = true;
		System.out.println("int i = " + i);
		Integer i_w = i;
		System.out.println("Integer i_w = " + i_w);
		System.out.println("double d = " +  d);
		Double d_w = d;
		System.out.println("Double d_w = " +  d_w);
		System.out.println("byte by = " + by );
		Byte by_w = by;
		System.out.println("Byte by_w = " + by_w );
		System.out.println("short s = " + s);
		Short s_w = s;
		System.out.println("Short s_w = " + s_w);
		System.out.println("long l = " + l );
		Long l_w = l;
		System.out.println("Long l_w = " + l_w );
		System.out.println("float f = " + f );
		Float f_w = f;
		System.out.println("Float f_w = " + f_w );
		System.out.println("char c = " + c);
		Character c_w = c;
		System.out.println("Character c_w = " + c_w);
		System.out.println("boolean b = " + b );
		Boolean b_w = b;
		System.out.println("Boolean b_w = " + b_w );
		
		
		
		}

}
