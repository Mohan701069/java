package com.todaylearnings;

public class Methodoverloading {
	void data() {//non parameterized method
		System.out.println("employee detail");
		System.out.println();
	}
	void data(String s) {// parameterized method  data type
		System.out.println("employee name:"+s);
	}
	void data(int x,double y) {//data type order
		System.out.println("employee id no:"+x);
		System.out.println("employee salary:"+y);
			
	}
	void data(String a,String b) {//data type count
		System.out.println("employee designation:"+a);
		System.out.println("employee department:"+b);
	}
		public static void main(String[] args) {
			Methodoverloading e1=new Methodoverloading();
			e1.data();
			e1.data("gokul");
			e1.data(5001,25500.50);
			e1.data("assistant manager","fjfjfgjfj");
			
			
		}
	
	

}
