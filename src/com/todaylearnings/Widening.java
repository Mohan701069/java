package com.todaylearnings;

public class Widening {

	public static void main(String[] args) {
		byte b = 30;// widening
		int i = b;// convert lower to higher data type
		System.out.println(i);
		long l = b;
		System.out.println(l);
		short s = b;
		System.out.println(s);

		float f = 4500.50f;// narrowing
		int id = (int) f;// convert higher to lower data type
		System.out.println(id);
		double d=55.45;
		long x=(long)d;
		System.out.println(x);
	
		

	}

}
