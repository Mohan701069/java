package com.java;

public class Bankdetails extends Bank {

	@Override
	public void sbi() {
		System.out.println("rate of intrest 15%");
		
	}
	public static void main(String[] args) {
		Bankdetails b1=new Bankdetails();
		b1.sbi();
		b1.kvb();
		b1.axis();
		
	}


	
	

}
