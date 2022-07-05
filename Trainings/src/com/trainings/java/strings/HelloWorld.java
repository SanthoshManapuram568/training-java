package com.trainings.java.strings;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		String fullName = null;
		//used to take the input from the console
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name ");
		//.next() is used to read the string value from the console
		fullName = scanner.nextLine();
		System.out.println("Entered name is :"+fullName);
		scanner.close();
		
		System.out.println("Length of name : "+fullName.length());
		System.out.println("CAPS : "+fullName.toUpperCase());
		System.out.println("Concat : "+fullName.concat("naidu"));
		System.out.println("**********************");
		System.out.println("Substring of 0 :"+fullName.substring(0));
		System.out.println("Substring of 3 :"+fullName.substring(3));
		System.out.println("Substring of 2,8 :"+fullName.substring(2,8));
		System.out.println("**********************");
		System.out.println("Char AT :"+fullName.charAt(5));
		System.out.println("**********************");
		System.out.println("Equals : "+fullName.equals("bhuvanesh"));
		System.out.println("== : "+fullName == ("bhuvanesh"));
		System.out.println("Equals Ignore case : "+fullName.equalsIgnoreCase("Bhuvanesh"));
		System.out.println("**********************");
		System.out.println("HASH CODE : "+fullName.hashCode());
		System.out.println("**********************");
		System.out.println("Conatins : "+fullName.contains("x"));
		System.out.println("**********************");
		System.out.println("INDEx of : "+fullName.indexOf("h"));
		System.out.println("INDEx of : "+fullName.lastIndexOf("h"));
		System.out.println("**********************");
		System.out.println("Replace :"+fullName.replace("hu", "xy"));
		System.out.println("**********************");
		System.out.println("EMPTY :"+fullName.isEmpty());
		System.out.println("**********************");
		System.out.println("TRIM : "+fullName.trim());
		System.out.println("**********************");
			
	}
}
