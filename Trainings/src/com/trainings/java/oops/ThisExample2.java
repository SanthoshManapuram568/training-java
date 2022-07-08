package com.java.training.oops;

public class ThisExample2 {

	ThisExample1 obj;
	
	public ThisExample2(ThisExample1 obj) {
		this.obj = obj;
	}
	
	void display() {
		System.out.println(obj.a);
	}

}
