package com.java.training.oops;

public class StaticExample {
	
	static String nameOfCollege = "RCEE"; //static variable
	
	int a = 10;

	//static method
	static void changeCollegeName() {
		nameOfCollege = "RCE";
		System.out.println("Inside Method :"+nameOfCollege);
	}
	
	public void method() {
		StaticExample.changeCollegeName();
		System.out.println(a);
	}
	
	public static void main(String[] args) {
//		StaticExample example = new StaticExample();
		
		
		StaticExample.changeCollegeName();
		
		System.out.println("From main method :"+nameOfCollege);
	}
	
	static {
		System.out.println("HAI from static block");
	}
	
}
