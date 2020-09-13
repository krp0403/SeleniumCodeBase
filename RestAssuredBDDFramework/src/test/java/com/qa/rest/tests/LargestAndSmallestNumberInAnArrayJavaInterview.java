package com.qa.rest.tests;

import java.util.Arrays;

public class LargestAndSmallestNumberInAnArrayJavaInterview {

	public static void main(String[] args) {

		int number[] = {-123, 232, 4556, 34, 343, -89, 8};

		int largest =  number[0]; // initialize to 1st element in array.
		int smallest = number [0]; //  ---"-----

		for (int i = 1; i < number.length; i++) { // initialize i to second element of the array and then compare with 1st element.

			if (number[i]> largest ) {
				largest = number[i];
			}
			else if (number[i]< smallest) {
				smallest = number[i];

			}
				
		}
		System.out.println("\n The given array is: "+ Arrays.toString(number));
		System.out.println("The largest number is " + largest);
		System.out.println("The smmallest number is "+ smallest);


	}

}