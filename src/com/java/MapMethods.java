package com.java;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class MapMethods {
	public static void main(String[] args) {
		Map<Integer,String>m1=new TreeMap<>();
		System.out.println(m1);
		m1.put(10, "mohan");
		m1.put(20, "gokul");
		m1.put(30, "sandy");
		m1.put(40, "vinoth");
		m1.put(50, null);
		m1.put(50, "pavi");//duplicate key doesn't allow it over ride
		m1.put(60, "pavi");//allow duplicate values, null values
		System.out.println(m1);
		int size = m1.size();
		System.out.println(size);
		String string = m1.get(60);
		System.out.println(string);
		Collection<String> values = m1.values();
		System.out.println(values);
		Set<Integer> ks = m1.keySet();
		System.out.println(ks);
		Set<Entry<Integer,String>> set = m1.entrySet();
		System.out.println(set);
		boolean key = m1.containsKey(20);
		System.out.println(key);
		boolean b = m1.containsValue("sandy");
		System.out.println(b);
		System.out.println(set);
		for(Entry<Integer,String> raj : set) {
			System.out.println(raj);
		}
		
		
	}

}
