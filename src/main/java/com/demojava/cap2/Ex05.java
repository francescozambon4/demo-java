package com.demojava.cap2;

import com.demojava.cap2.utils.*;

public class Ex05 {
	/*
	 * 	Modify the previous exercise so that the values of the data in DataOnly are assigned to and printed in main( ).
	 * */
	public static void main(String[] args) {
		DataOnly dataonly = new DataOnly();
		dataonly.i = 100;
		dataonly.d = 100.00;
		dataonly.b = true;
		
		System.out.println(dataonly.i);
		System.out.println(dataonly.d);
		System.out.println(dataonly.b);
		

	}

}
