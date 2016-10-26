package com.demojava.cap5;

import com.demojava.cap5.utils.Ex17Test;

/*
 * Complete the previous exercise by creating objects to attach to the array of references.
 */

public class Ex18 {

	public static void main(String[] args) {
		Ex17Test[] T = new Ex17Test[10];
		 for(int i = 0; i < T.length; i++)
			 T[i] = new Ex17Test("String" + i);
	}

}
