package com.trainings.java.loops;

import java.util.Scanner;

public class IfLoop {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a value");
		a = scanner.nextInt();
		
		System.out.println("Enter b value");
		b = scanner.nextInt();
		
		System.out.println("Enter c value");
		c = scanner.nextInt();
		
		if((a==10)||(a>b && a>c)) {
			System.out.println("A is greater"+a);
		}else if(b>a && b>c) {
			System.out.println("B is greater"+b);
		}else {
			System.out.println("C is greater"+c);
		}
		
		SwitchCase case1 = new SwitchCase();
		System.out.println("calling boku "+case1.avinash());
		
		scanner.close();
	}
	
}
