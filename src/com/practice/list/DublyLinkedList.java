package com.practice.list;

public class DublyLinkedList {

	public static void main (String args []) {
		Employee e1 = new Employee(1, "Abhijeet");
		Employee e2 = new Employee(2, "Soham");
		Employee e3 = new Employee(3, "Chinu");
		Employee e4 = new Employee(4, "Atul");
		
		EmployeeDoublyLinkedList ll = new EmployeeDoublyLinkedList();
		System.out.println(ll.isEmpty());
		
		ll.addToFront(e2);
		ll.addToFront(e1);
		ll.addToEnt(e3);
		ll.addToEnt(e4);
		
		ll.printList();
		
		System.out.println(ll.getSize());
		
		ll.removeFromFront();
		ll.printList();
		System.out.println(ll.getSize());
		
		System.out.println(ll.removeFromEnd());
		ll.printList();
		System.out.println(ll.getSize());
		
	}
}

class DEmployeeNode {
	private Employee employee;
	private DEmployeeNode previous;
	private DEmployeeNode next;

	public DEmployeeNode (Employee employee) {
		this.employee = employee;
	}
	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public DEmployeeNode getPrevious() {
		return previous;
	}
	public void setPrevious(DEmployeeNode previous) {
		this.previous = previous;
	}
	public DEmployeeNode getNext() {
		return next;
	}
	public void setNext(DEmployeeNode next) {
		this.next = next;
	}
	
	public String toString() {
		return employee.toString();
	}
	
}

class EmployeeDoublyLinkedList {
	
	private DEmployeeNode head;
	private DEmployeeNode tail;
	private int size;
	
	public void addToFront(Employee employee) {
		DEmployeeNode node = new DEmployeeNode(employee);
		node.setNext(head);
		if(head == null) {
			tail = node;
		}
		else {
			head.setPrevious(node);
		}
		head = node;
		size++;
	}
	
	public void addToEnt(Employee employee) {
		DEmployeeNode node = new DEmployeeNode(employee);
		if(head == null) {
			head = node;
		}else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		tail = node;
		size++;
	}
	
	
	public DEmployeeNode removeFromFront() {
		if(isEmpty()) {
			return null;
		}
		
		DEmployeeNode removedNode = head;
		
		if(head.getNext() == null) { // only one node in list
			tail = null;
		}else {
			head.getNext().setPrevious(null);
		}
		
		head = head.getNext();
		size --;
		removedNode.setNext(null);
		return removedNode;
		
	}
	
	public DEmployeeNode removeFromEnd() {
		if(isEmpty()) {
			return null;
		}
		
		DEmployeeNode removedNode = tail;
		if(tail.getPrevious() == null) { // only one node in list
			tail = null;
		}else {
			tail.getPrevious().setNext(null);
		}
		tail = tail.getPrevious();
		size--;
		removedNode.setPrevious(null);
		return removedNode;
		
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void printList() {
		DEmployeeNode current = head;
		System.out.print("HEAD -> ");
		while(current != null) {
			System.out.print(current);
			System.out.print(" <=> ");
			current = current.getNext();
		}
		System.out.println("null");
	}
	
}