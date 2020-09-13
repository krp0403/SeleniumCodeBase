package com.qa.rest.tests;

public class SwapTwoIntegersJavaInterview {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 20;
		
		i = i+j;
		j = i-j;
		i= i-j;
		
		// by having an additional variable. 
		
		int k= 10; 	int l = 20;	int m= k;k = l;l=m;
		
		System.out.println(k);
		System.out.println(l);
	
	//	System.out.println(m);
		System.out.println(i);
		System.out.println(j);
		

		
	}

}
