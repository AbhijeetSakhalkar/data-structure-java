package com.practice.stack;

public class StackLLMain {

	public static void main(String[] args) {
		StackLL stack = new StackLL();

		stack.push(new Employee(1, "Abhijeet"));
		stack.push(new Employee(2, "Soham"));
		stack.push(new Employee(3, "Atul"));
		stack.push(new Employee(4, "Rajiv"));
		
		stack.printStack();
		System.out.println();
		System.out.println("Popped: "+stack.pop());
		System.out.println();
		stack.printStack();
		System.out.println();
		System.out.println("Peeked: "+stack.peek());
		System.out.println();
		stack.printStack();
		
		
	}

}
