package com.java;

public class Array_concept {

	public static void main(String[] args) {
		int a[]=new int[6];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		a[5]=6;
		
		System.out.println(a.length);
		System.out.println();

		for(int i=0;i <a.length;i++) {
			
			for(int j=0; j<a.length; j++) {
				System.out.print(a[j]+" " );
			}
			System.out.println();
		}
	}

}
