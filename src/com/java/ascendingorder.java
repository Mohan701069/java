package com.java;

public class ascendingorder {

	public static void main(String[] args) {
		int b[] = new int[6];
		b[0] = 5;
		b[1] = 4;
		b[2] = 6;
		b[3] = 3;
		b[4] = 8;
		b[5] = 7;
		System.out.println(b.length);
		System.out.println();
		System.out.println(" before sorting");

		for (int a : b) {
			System.out.print(a + " ");

		}
		int c;//temporary variable 
		for (int i = 0; i < b.length; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i] > b[j]) {// 5<4 condition false  go to inner loop 5<6 condition true 
					c = b[i]; //swap the number 5 to  6 go to outer loop increment  i value
					b[i] = b[j];//action continue outer loop condition became false
					b[j] = c;//[5,4,6,3,8,7][6,4,5,3,8,7]
				}
			}
		}
		System.out.println();
		System.out.println(" sorting in desending number");
		for (int a : b) {
			System.out.print(a + " ");

		}

	}
}