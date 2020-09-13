package com.qa.rest.tests;

public class StringManipulationJavaInterview {

	public static void main(String[] args) {
	
		String Str = "The range has started here";
		// for string compare: add another string. Java is case sensitive so for string compare to be true both strings have to be exact same.
		String Str1 =  "The range has started here";
		String Str2 = "The Range has started here";
		
		System.out.println(Str1.equalsIgnoreCase(Str2));
		
// length of the string -->
		System.out.println("The length of string is " + Str.length());
 // character at a particular index ---> 
	 System.out.println("The character at 5th index is " + Str.charAt(5)); // 5 is the index value.
// find the index of character 
	 System.out.println("The index of character n is " + Str.indexOf('n'));
//  for finding the specific occurrence  of a character shift the index after first occurrence --> 
	 System.out.println("The index of character e is " + Str.indexOf('e', 9));
// To remove the hard coding while finding the occurrence.
	 System.out.println("The index of second occurrence of character e is " + Str.indexOf('e', Str.indexOf('e')+3));
	
// String compare
	 
	 System.out.println(Str.equals(Str1));// will return True on console
	 
	System.out.println(Str.equals(Str2));// Should return false on console. 
	
// Getting the sub string . "Str.substring(Startindex, endindex);
	
	System.out.println("The sub string starting at 0 and ending at index 9 is " );
	System.out.println( "-->" + Str.substring(0, 9));
	
	
	
	
	}

}
