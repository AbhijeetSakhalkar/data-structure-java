package com.practice.queue;

public class QueueArrayMain {

	public static void main(String[] args) {
		
		QueueArray queue = new QueueArray(10);
		
		queue.add(new Employee(1, "Abhijeet Sakhalkar"));
		queue.add(new Employee(2, "Soham Mahajan"));
		queue.add(new Employee(3, "Atul Phirke"));
		queue.add(new Employee(4, "Ravi Pingle"));

		queue.printQueue();
		
		System.out.println();
		
		queue.remove();
		queue.remove();
		
		queue.printQueue();
		
		System.out.println();
		System.out.println("Peek: "+queue.peek());
		System.out.println();
		queue.printQueue();
	}

}
