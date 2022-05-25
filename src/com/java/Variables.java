package com.java;

public class Variables {
	float b;// class variable
	static int i = 30;// static variable

	public void display() {
		String s = "mohan";// local variable
		System.out.println("my name is:" + s);

	}

	public static void print()// static method
	{
		int i = 40;
		System.out.println(i);
	}

	public static void main(String[] args) {
		Variables v = new Variables();
		System.out.println(i);// static variable without any object creation
		print();// static method
		System.out.println(v.b);// class variable declaration
		v.display();

	}

}
