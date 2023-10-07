package com.practice.zzz.threading;

public class ProducerConsumer1 {

	private static int table = 0;
	private static int min = 0;
	private static int max = 3;
	
	private static int count = 0;
	private static int trials = 50;
	
	public void produce () throws InterruptedException {
		synchronized(this) {
			while(count < trials) {
				while(table >= max) {
					wait();
				}
				System.out.println("Produced  :" + table ++ + " Count: " + count);
				count ++;
				notify();
			}
		}
	}
	public void consume () throws InterruptedException {
		synchronized (this) {
			while(count < trials) {
				while(table <= min) {
					wait();
				}
				System.out.println("Consumed  :" + table -- + " Count: " + count);
				count ++;
				notify();
			}
		}
	}
	
	public static void main(String [] args) {
		ProducerConsumer1 pc = new ProducerConsumer1();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pc.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		
		t1.start();
		t2.start();
	}
	
}