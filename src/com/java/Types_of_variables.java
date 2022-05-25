package com.java;

public class Types_of_variables {

	static int b=50;//static variable
	int c =30;//class variable
	
	private void name() {
		int b=10;//local variable
		b++;
		System.out.println(b);
		System.out.println(this.c);
		
	}
	public static void main(String[] args) {
		Types_of_variables o=new Types_of_variables();
		System.out.println(b);//static variable		o.name();//local variable
		System.out.println(o.c);//class variable
		
		
	}
	
}
