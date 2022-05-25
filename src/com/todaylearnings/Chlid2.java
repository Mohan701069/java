package com.todaylearnings;

public class Chlid2 extends Chlid1{
int a;
public void getvalues()
{
	System.out.println(a);
}
public static void main(String[] args) {
	
	Chlid2 c1=new Chlid2();
	c1.a=10;
	c1.print();
	c1.display();
	c1.getvalues();
}
}
