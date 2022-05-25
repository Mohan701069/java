package com.todaylearnings;

public class Employee_2 extends Employee{
private void company()
{
	System.out.println("infosys");
}
public void data() {
	super.data();
}
public static void main(String[] args) {
	Employee_2 e1=new Employee_2();
	e1.data();
	e1.place();
	e1.company();
	
	
}

}
