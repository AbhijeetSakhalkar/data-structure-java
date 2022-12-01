package com.practice.queue;

import java.util.LinkedList;

public class PalindromeUsingStackAndQueue {

	public static void main (String args [] ) {
		
		System.out.println(isPalindrome("dad"));
		System.out.println(isPalindrome("Car Rac"));
		System.out.println(isPalindrome("dada"));
		
	}
	
	private static boolean isPalindrome(String str) {
		LinkedList<Character> queue = new LinkedList<Character>();
		LinkedList<Character> stack = new LinkedList<Character>();
		String lowerCase = str.toLowerCase();
		
		for(int i=0;i<lowerCase.length();i++) {
			char c = lowerCase.charAt(i);
			if(c >= 'a' || c <= 'z') {
				queue.addLast(c);
				stack.push(c);
			}
		}
		
		while(!stack.isEmpty()) {
			if(!stack.pop().equals(queue.removeFirst())) {
				return false;
			}
		}
		return true;
		
	}
	
}
