package com.qa.rest.tests;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateFromAnArrayJavaInterview {

	public static void main(String[] args) {

		String names[] = {"Java","JavaScript","Ruby","C","Python","Java","C"};
		/*String n = "KiranParanjape";

		// solution #1. Using algo. but higher time complexity.

	int length = n.length();
	for (int q=0;q<length;q++) {

		for(int p = q+1;p<length;q++) {
			if (n.charAt(q)== n.charAt(p)) {
				System.out.println("The duplicate letter is "+ n.charAt(q));
			}
		
		
		}
*/
	}
		int len = names.length;
		for(int i=0;i<len;i++) {

			for (int j = i+1; j <len; j++) {

				if(names[i].equals(names[j])) {

					System.out.println("duplicate string from an array is " + names[i]);
				}

			}

		}

		System.out.println("*******************");

		// Solution #2: Using hashset. It is a part of Java collections. Which stores only unique values.

		Set<String> store = new HashSet<String>();

		for(String name : names) {/// for each loop to iterate through names array.

			if (store.add(name) == false) { // if the hashset tries to add a duplicate element then it will return false. and we will catch that element and print it. 

				System.out.println(name);
			}
		}

		System.out.println("*******************");

		

	}

}
