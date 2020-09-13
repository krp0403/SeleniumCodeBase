package com.qa.rest.tests;

public class ReverseAnIntegerJAVAINTERVIEW {

	public static void main(String[] args) {
// Reversing the integer using proper algorithmic method.
		
		int num = 1234567890;
		long rev= 0;
		System.out.println("The integer to be reversed is "+ num);

		while(num!= 0) {

			rev = rev * 10 + num % 10;
			num = num /10;

		}

		System.out.println("The reversed integer is "+ rev);
		// String buffer reverse method.
		int num1 = 54321;
		System.out.println("The next integer to be reversed now using the string buffer method is "+ num1);
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		// The StringBuffer is a mutable object of the class StringBuffer and has an inbuild function called .reverse..
		System.out.println("The reversed integer value using StringBuffer is " + num1 );
	}


	

}


