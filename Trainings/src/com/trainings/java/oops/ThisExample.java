package com.java.training.oops;

public class ThisExample {

	int rollNo;
	String name;
	char grade;
	
	public ThisExample() {
		this(123,"xyz",'c');
		System.out.println("Dummy is called");
	}

	public ThisExample(int rollNo,String name,char grade) {
		//this(); calling dummy constructor from another constructor
		System.out.println("FROM CONSTRUCTOR");
		System.out.println(" Roll : "+rollNo+"\n Name : "+name+"\n Grade : "+grade);
		this.rollNo = rollNo;
		this.name = name;
		this.grade = grade;
		
	}
	
	public void finalName() {
		
		System.out.println("FROM METHOD");
		System.out.println(" Roll : "+rollNo+"\n Name : "+name+"\n Grade : "+grade);
	}
	
	public static void main(String[] args) {
		ThisExample example = new ThisExample(123, "Avinash", 'a');
		ThisExample example2 = new ThisExample();
		example.finalName();
	}
	
}
