package com.qa.rest.tests;

public class SumOf10 {

	public  static void main(String[] args) {
		int a[] = {1,2,3,4,5,6,7,8,8,9,0};
		SumOf10 s= new SumOf10();
		s.printPairs( a, 10);
		//printPairs({1,2,3,4,5,6,7,8,8,9,0}, 10);

	}

	public  void printPairs(int[] array, int sum) {

		for (int i = 0; i < array.length; i++) {
			int first = array[i];
			for (int j = i + 1; j < array.length; j++) {
				int second = array[j];

				if ((first + second) == sum) {
					System.out.printf("(%d, %d) %n", first, second);
				}
			}

		}
	}    }