package com.java;

public class Banking implements Payment{

	@Override
	public void googlepay() {
		System.out.println("sent amount 1000");
		
	}

	@Override
	public void paytm() {
		System.out.println("sent amount 500");
		
	}

	@Override
	public void phonepay() {
		System.out.println("received amount 1000");
		
	}
	public static void main(String[] args) {
		Banking b1=new Banking();
		b1.googlepay();
		b1.paytm();
		b1.phonepay();
		
	}


}
