package com.java;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	

	public static void main(String[] args) {
	List<Object>l1	=new ArrayList<Object>();
	l1.add(10);
	l1.add('a');
	l1.add(15);
	l1.add("mohan");
	l1.add(2.5);
	
	List<String>l2=new ArrayList<>();
	l2.add("mohan");
	l2.add("gokul");
	l2.add("sandy");
	l2.add("vino");
	l2.add("pavi");
	System.out.println("total element:"+l1);
	System.out.println("total element:"+l2);
	l1.add(l2);
	System.out.println(l1);
	int i = l1.size();
	System.out.println(i);
	String s = l2.get(4);
	System.out.println(s);
	l1.remove(3);
	System.out.println(l1);
	boolean contains = l1.contains("mohan");
	System.out.println(contains);
	l1.retainAll(l2);
	System.out.println(l1);
	
	
	
	
	
	
	

	}

}

