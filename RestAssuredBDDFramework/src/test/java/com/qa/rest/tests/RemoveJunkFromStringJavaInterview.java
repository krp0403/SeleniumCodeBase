package com.qa.rest.tests;

public class RemoveJunkFromStringJavaInterview {

	public static void main(String[] args) {

		// Removing junk charachters from string using regular expressions. 
		String s = "aasdsd@#@#@#hasdsa@E@#@$%$%$";
		/* here we will use the .replaceall function in java with a regular expression [^a-zA-Z0-9] which says remove everything
		 * from the string which is not in the range of (a-z,A-Z & 0-9). lets see
		 */
		
		System.out.println("The string with junk characters looks like -->>" + s);
		s = s.replaceAll("[^a-zA-Z0-9]", ""); 
		System.out.println("The string without junk characters loooks like this " +s  );
	

	}

}
