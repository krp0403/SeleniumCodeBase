package com.qa.rest.tests;

public class swapStrings {

	public static void main(String[] args) {
		
		String s = "hello";
		String m = "world";
		
		System.out.println("Value of S prior to swap " +s);
		System.out.println("Value of M prior to Swap " +m);
		
		s= s+m;
		System.out.println(s);
		m = s.substring(0, m.length());
		s = s.substring(m.length());
		
		System.out.println("Value of S after Swap " +s);
		System.out.println("Value of M after Swap  " +m);
		

	}

}
