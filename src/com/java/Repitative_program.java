package com.java;

public class Repitative_program {

	public static void main(String[] args) {
	  String s ="Java is a Programming Language "
	  		+ " Java Phython is also a Programming Language";
	  int count;
	   String lowerCase = s.toLowerCase();
	   System.out.println(lowerCase);
	   System.out.println();
	   String upperCase = s.toUpperCase();
	   System.out.println(upperCase);
	   String[] split = s.split(" ");
	  
	   for( String a:split) {
		   System.out.println(a);
		   System.out.println();
	   }
	   System.out.println("duplicate words :");
	   for(int i=0;i<split.length;i++) {
		   count =1;
		   for (int j=i+1;j<split.length;j++) {
			   if(split[i].equals(split[j])) {
				   count ++;
				   
				   
			   }
		   }
		   if(count >1 ) {
			   System.out.println(split[i]);  
			   
		   }
	   }
	   

	}

}
