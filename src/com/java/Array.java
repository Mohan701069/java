package com.java;

public class Array {

	public static void main(String[] args) {
		String a[] = new String[7];
		a[0] = "monday";
		a[1] = "tuesday";
		a[2] = "wednesday";
		a[3] = "thursday";
		a[4] = "friday";
		a[5] = "saturday";
		a[6] = "sunday";
		System.out.println(a.length);
		System.out.println();

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
