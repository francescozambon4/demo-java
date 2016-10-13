package com.demojava.cap3.utils;

public class AliasingTest {
	public float aliasing;
	
	@Override
	public String toString(){
		return aliasing + "";
	}
	
	public static void f(AliasingTest y){
		y.aliasing = 11.5522f;
	}
}
