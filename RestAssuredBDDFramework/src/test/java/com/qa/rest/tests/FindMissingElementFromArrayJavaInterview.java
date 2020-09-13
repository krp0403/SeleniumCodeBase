package com.qa.rest.tests;

public class FindMissingElementFromArrayJavaInterview {

	public static void main(String[] args) {

		int[] a = {1,2,4,5}; // lets find the missing integer.

		int sum = 0;
		for (int i =0;  i<a.length;i++) {
			sum = sum +a[i];
		}
		System.out.println("The value of sum is " + sum);
		int sum1 = 0;
		for (int j =1; j<=5; j++) {
			sum1 = sum1 + j;
		
		}
		System.out.println("The missing number from array a is "  + (sum1-sum));
	}

}
