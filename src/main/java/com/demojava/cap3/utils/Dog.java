package com.demojava.cap3.utils;

public class Dog {
	
	 String name;
	 String says;
	 
	 public void setName(String name){
		  this.name = name;
	 }
	 
	 public void setSays(String says){
		 
		 this.says = says;
	 }
	
	 public void showName(){
		 
		 System.out.println(name);
	 }
	 
	 public void speak(){
		 
		 System.out.println(says);
	 }
}
