package com.qa.rest.tests;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateArrayList {

	public static void main(String[] args) {
	
		ArrayList<String> test = new ArrayList<String>();
		test.add("One");
		test.add("two");
		test.add("three");
		test.add("four");
		test.add("five");
		
		// Iterating the arraylist: 
		//1st way using lambda Expression:  below is the lambda expression execution which started after Java 1.8.
		
		System.out.println("------Print values using the Lambda 8 Expression-----");
		test.forEach(item -> {
			System.out.println(item);
		});
	
		System.out.println("-----Print using the iterator function-----");

		Iterator<String> it = test.iterator();
		
		while(it.hasNext()) {
			String value = it.next();
					System.out.println(value);
		}
	
		System.out.println("-----Print using For Each-----");
		
		it = test.iterator();
		for(String print:test)		{
			
			System.out.println(print);
				}
	
		System.out.println("-----Print using for loop and order/ index-----");
	
		for(int i = 0;i <test.size();i++) {
			System.out.println(test.get(i));
			
			
		}
	
	}
	

	
}
