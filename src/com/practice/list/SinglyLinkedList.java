package com.practice.list;

public class SinglyLinkedList {

	public static void main(String[] args) {
		
		
		Employee e1 = new Employee(1, "Abhijeet");
		Employee e2 = new Employee(2, "Soham");
		Employee e3 = new Employee(3, "Chinu");
		Employee e4 = new Employee(4, "Atul");

		EmployeeLinkedList ll = new EmployeeLinkedList();

		System.out.println(ll.isEmpty());
		
		ll.addToFront(e4);
		ll.addToFront(e3);
		ll.addToFront(e2);
		ll.addToFront(e1);
		
		System.out.println(ll.getSize());
		
		ll.printList();
		
		ll.removeFromFront();
		
		System.out.println(ll.getSize());
		
		ll.printList();
		
	}

}


class EmployeeNode {
	private Employee employee;
	private EmployeeNode next;
	
	public EmployeeNode(Employee employee) {
		this.employee = employee;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeNode getNext() {
		return next;
	}

	public void setNext(EmployeeNode next) {
		this.next = next;
	}
	
	public String toString() {
		return employee.toString();
	}
	
}

class EmployeeLinkedList {
	
	private EmployeeNode head;
	private int size;
	
	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		head = node;
		size++;
	}
	
	public EmployeeNode removeFromFront() {
		if(isEmpty()) {
			return null;
		}
		
		EmployeeNode removedNode = head;
		head = head.getNext();
		size --;
		removedNode.setNext(null);
		return removedNode;
		
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void printList() {
		EmployeeNode current = head;
		System.out.print("HEAD -> ");
		while(current != null) {
			System.out.print(current);
			System.out.print(" -> ");
			current = current.getNext();
		}
		System.out.println("null");
	}
	
}