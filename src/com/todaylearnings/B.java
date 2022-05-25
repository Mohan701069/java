package com.todaylearnings;

public class B extends A {
	public void department() {
		System.out.println("mechanical");
	}
	public void name() {
		super.name();
		
	}
	public void idno() {
		super.idno();
		
	}
	public static void main(String[] args) {
		B b1 = new B();
		b1.name();
		b1.idno();
		b1.department();

	}

	
	
	
	
	
	

	
	

	
}
