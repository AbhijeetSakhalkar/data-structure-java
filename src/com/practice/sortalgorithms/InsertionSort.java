package com.practice.sortalgorithms;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int [] array = getRandomArrayOfLength(10000);
		//System.out.println(Arrays.toString(array));
		System.out.println("Insertion Sort:");
		sort(array);

	}

	/*
	 * Keep sorted array at left side. pick element and place at the perfect sorted position.
	 */
	private static int [] sort(int [] array) {
		long start = System.currentTimeMillis();
		for(int firstUnsortedIndex = 1 ; firstUnsortedIndex < array.length ; firstUnsortedIndex ++) {
			for(int i = firstUnsortedIndex ; i>0 ; i--) {
				if(array[i] < array[i-1]) {
					int tmp = array[i];
					array[i] = array[i-1];
					array[i-1] = tmp;
				}
				else {
					continue;
				}
			}
		}
		System.out.println("Total time in ms: " + (System.currentTimeMillis() - start));
		return array;
	}
	
	public static int [] getRandomArrayOfLength(int length) {
		int array [] = new int[length];
		for(int i=0;i<length;i++) {
			array[i] = (int)(Math.random() * 1000);
		}
		return array;
	}
}
