package com.java;

import java.util.Scanner;

public class odd_even {

	public static void main(String[] args) {
		
	
	
		Scanner a1 =new Scanner(System.in);
		
		System.out.print("Enter the integer:");
		  int nextInt = a1.nextInt();

		a1.close();
		if(nextInt%2==0) {
			System.out.print("it is even number:");
		}
		else{
			System.out.print(" it is odd number:");
		}
	
		

	}

}

