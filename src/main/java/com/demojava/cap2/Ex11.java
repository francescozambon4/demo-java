package com.demojava.cap2;
 import com.demojava.cap2.utils.*;
public class Ex11 {
	
	/*
	 * Turn the AllTheColorsOfTheRainbow example into a program that compiles and runs.
	 */
	public static void main(String[] args) {
		AllTheColorsOfTheRainbow atc = new AllTheColorsOfTheRainbow();
		System.out.println("atc.anIntegerRepresentingColors " + atc.anIntegerRepresentingColors);
		atc.changeColor(7);
		atc.changeTheHueOfTheColor(77);
		System.out.println("Dopo il cambiamento del colore atc.anIntegerRepresentingColors " + atc.anIntegerRepresentingColors);
		System.out.println("atc.hue " + atc.hue);
	}

}
