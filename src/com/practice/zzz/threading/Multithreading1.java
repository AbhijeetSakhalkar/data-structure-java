package com.practice.zzz.threading;

public class Multithreading1 {
	
	static int N = 10;
	static int count = 0;
	
	public void printOdd() {
		synchronized(this) {
			while(count<N) {
				while(count % 2 == 0) {
					try {
						wait();
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
					
				}
				System.out.println("Odd  : " + count ++);
				notify();
			}
		}
	}
	
	public void printEven() {
		synchronized(this) {
			while(count < N) {
				while(count % 2 == 1) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Even : " + count ++);
				notify();
			}
		}
	}
	
	public static void main(String [] args) {
		Multithreading1 mt = new Multithreading1();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				mt.printEven();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				mt.printOdd();
			}
		});
		
		t1.start();
		t2.start();
	}
	
}
