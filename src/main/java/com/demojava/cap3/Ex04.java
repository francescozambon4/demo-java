package com.demojava.cap3;

import com.demojava.cap3.utils.*;

	/*
	 * Write a program that calculates velocity using a constant distance and a constant time.
	 */

public class Ex04 {

	public static void main(String[] args) {
		float d = 555.787f;
		float t = 152.66f;
		
		System.out.println("la distanza è " + d);
		System.out.println("il tempo è " + t);
		
		System.out.println("la velocità è " + VelocityCalculator.velocity(d, t));

	}

}
