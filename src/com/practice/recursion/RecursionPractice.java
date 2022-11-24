package com.practice.recursion;

public class RecursionPractice {

	public static void main(String args []) {
		
		//System.out.println(getFactorial(5));
		System.out.println(getFibonnaciforNth(6));
		
	}
	
	private static int getFactorial(int n) {
		
		if(n == 0 || n ==1) {
			return 1;
		}
		
		return n * getFactorial(n-1);
		
	}
	
	private static int getFibonnaciforNth(int n) {
		if( n == 1) return 0;
		else if( n == 2) return 1;
		else if (n == 3 ) return (0+1);
		else return getFibonnaciforNth(n-1) + getFibonnaciforNth(n-2);
	}
	
	// 0,1,1,2,3,5
}
