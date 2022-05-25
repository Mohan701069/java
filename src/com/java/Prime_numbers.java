package com.java;

import java.util.Scanner;

public class Prime_numbers {

	public static void main(String[] args) {
		Scanner s1 =new Scanner(System.in);
		System.out.println("enter the  number 1 to 100");
		  int i = s1.nextInt();
		int count=0;
		for(int j=1;j<i;j++) {
			if(i%j==0) {
				count++;
			}
			if(count==2) {
				System.out.println("it is a prime nuber");
			}
			else {
				System.out.println("it is not a prime number");
			}
		}
		
		}


	

}
