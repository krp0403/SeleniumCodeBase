package com.qa.rest.tests;

public class FindPalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isPalindromNumber(122);

	}

	public static void isPalindromNumber(int number)

	{

		System.out.println("The given number to check palindrom logic is: " +number);
		int r=0;
		int sum=0;
		int t;

		t= number;
		while(number>0) {

			r= number%10 ; // get the remainder
			sum = (sum*10)+r;
			number = number/10; 

		}

		if(t==sum) {
			System.out.println("This is a Palindrom number");
		}
		else {
			System.out.println("This is not a palindrom number");
		}

	}
}
