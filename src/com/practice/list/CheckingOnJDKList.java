package com.practice.list;

import java.util.Iterator;
import java.util.LinkedList;

public class CheckingOnJDKList {

	public static void main(String args[]) {
		
		Employee e1 = new Employee(1, "Abhijeet");
		Employee e2 = new Employee(2, "Soham");
		Employee e3 = new Employee(3, "Chinu");
		Employee e4 = new Employee(4, "Atul");
		
		LinkedList<Employee> list = new LinkedList<Employee>();
		list.addFirst(e2);
		list.addFirst(e1);
		list.addLast(e3);
		list.add(e4);
		
		Iterator<Employee> iter = list.iterator();
		System.out.print("HEAD -> ");
		while(iter.hasNext()) {
			System.out.print(iter.next());
			System.out.print("<=>");
		}
		System.out.println("null");
	}
	
}
