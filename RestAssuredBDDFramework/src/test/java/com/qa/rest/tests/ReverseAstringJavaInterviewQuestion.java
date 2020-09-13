package com.qa.rest.tests;

public class ReverseAstringJavaInterviewQuestion {

	public static void main(String[] args) {
		
		// Reversing a string using algorithm
		String s = "pipe";

		
		System.out.println("The string to be reversed is " + s);
		int len = s.length();
		String rev ="";
		
		for (int i = len-1;i>=0;i--) {
			rev= rev + s.charAt(i);			
		}
		
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("palindrom string");
			
			
		}
		else {
			System.out.println("not a palindrom string");
		}
		
		
		
		System.out.println("The reversed string is "+ rev);
	
		
	// Reversing a string using the String Buffer class.
		
		StringBuffer sb = new StringBuffer(s);
		
		System.out.println("The reversed string using string Buffer class is " +sb.reverse());
	}

}
