package com.java.training.oops;

public class Constructor {
	
	private int a =10;
	private int b = 20;

	public Constructor() {
		System.out.println("Default constructor");
	}
	
	public Constructor(int a, int b) {
		int c = a+b;
		System.out.println("values added is "+c);
	}
	
	private Constructor(int a) {
		System.out.println(" constructor with single prameter");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("calling constructors");
		Constructor const1 = new Constructor();
		Constructor const2 = new Constructor(10,20);
		Constructor const3 = new Constructor(10);
	}

}
