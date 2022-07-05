package com.trainings.java.loops;

public class ContAndBreak {
	
	public static void main(String[] args) {
		
		//break
		for(int i=1; i<=10; i++) {
			
			System.out.println(i+" ");	//op without 
			
			if(i==4) {
				System.out.println("You have reached maximum speed , please be cautious");
				continue;
			}
			
			System.out.println(i+" ");	// op with conditoon
		}
		
	}

}
