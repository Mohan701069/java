package com.java;


import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Iteration {

	public static void main(String[] args) {
		List<String>l1	=new LinkedList<String>();
		l1.add("gokul");
		l1.add("ravi");
		l1.add("gobi");
		l1.add("mohan");
		l1.add("sandy");
		System.out.println("my list is"+l1);
		System.out.println();
		System.out.println("forward direction");
		ListIterator<String> listIterator = l1.listIterator();
		while (listIterator.hasNext()) {
			String next = listIterator.next();
			System.out.println(next);
		}
			System.out.println("backward direction");
		while(listIterator.hasPrevious()) {
			String previous = listIterator.previous();
			System.out.println(previous);
			
		}
			
		

	}
	

}
