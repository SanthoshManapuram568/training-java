package com.java.training.oops;

public class ThisExample1 {

	int a = 10;
	
	public ThisExample1() {
		ThisExample2 example2 = new ThisExample2(this);
		example2.display();
		System.out.println("ThisExample1 dummy constructor called");
	}
	public static void main(String[] args) {
		ThisExample1 example1 = new ThisExample1();
	}
}
