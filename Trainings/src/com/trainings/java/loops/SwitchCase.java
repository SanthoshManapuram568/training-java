package com.trainings.java.loops;

import java.util.Scanner;

/**
 * 
 * this class is used for entering the house and checking the electronics usage
 * 
 * @author Santhosh
 *
 */
public class SwitchCase {

	public static void main(String[] args) {
		
		
		int switchNumber ;
		boolean fan = false;
		Scanner scanner = new Scanner(System.in); // what scanner does
		
		/*
		 * sjdfgkjsdgg 
		 * sdlhfkjsdhf sdbfkjsdfg sbddgfbsflgn
		 * 
		 */
		
		
		System.out.println("Enter to your home press 0 to cont.....");
		int enteredNumber = scanner.nextInt();
		
		if(enteredNumber == 0) {
			
			System.out.println("***********************");
			System.out.println("Enter 1 to turn on Fan");
			System.out.println("Enter 2 to turn on Light");
			System.out.println("Enter 3 to turn on Tv");
			System.out.println("***********************");
			System.out.println("Enter the swith number :");
			switchNumber = scanner.nextInt();
			
			
			switch(switchNumber) {
			case 1:
				System.out.println("Fan is turned on!!");
				fan = true;
				break;
			case 2:
				System.out.println("Light is turned on!!");
				break;
			case 3:
				System.out.println("TV is turned on!!");
				break;
			default:
				System.out.println("Nothing is turned on!!");
			}
			
			System.out.println("Type 5 to exit the house ");
			switchNumber=scanner.nextInt();
			
			
			switch(switchNumber) {
			
			case 5:
				exitHouse(fan);
			}
			
			scanner.close();
			
		}else {
			System.out.println("Sorry :( Your home is locked");	
		}
		
	}

	/**
	 * this method is used 
	 * 
	 * @param fan
	 */
	private static void exitHouse(boolean fan) {
		// TODO Auto-generated method stub
		if(fan) {
			System.out.println("Fan is turned on Please turn it off!!");
			
		}else {
			System.out.println("Until next time :) bye !!");
		}
	}
	
	public static String avinash() {
		return "Avinash";
	}
	
}
