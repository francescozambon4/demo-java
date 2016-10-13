package com.demojava.cap2.utils;

public class StorageTest {
	
	private int res; 
	
	public int storage(String s) {
		res = s.length() * 2;
		return res;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return new Integer(res).toString();
		return "" + res;
	}
	
	
}
