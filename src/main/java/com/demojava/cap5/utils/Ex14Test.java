package com.demojava.cap5.utils;

public class Ex14Test {
	
	public static String s1;
	public static String s2, s3;
	static{
		s2 = "Stringa 2";
		s3 = "Stringa 3";
		System.out.println("s2 & s3 inizializzate");
	}
		public static void how(){
			System.out.println(s1 + " o " + s2 + " o " + s3);
		}
	
	public Ex14Test(){
		System.out.println("Ex14Text: ");
	} 


}
