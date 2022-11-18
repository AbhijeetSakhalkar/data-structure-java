package com.practice.sortalgorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int [] array = getRandomArrayOfLength(10000);
		//System.out.println(Arrays.toString(array));
		System.out.println("Selection Sort:");
		sort(array);

	}
	
	/*
	 * Select the largest element and put it at the last unsorted index
	 */
	private static int [] sort(int [] array) {
		long start = System.currentTimeMillis();
		for(int lastUnsortedIndex=array.length-1;lastUnsortedIndex>0;lastUnsortedIndex--) {
			int largestIndex=0;
			for(int i=1;i<=lastUnsortedIndex;i++) {
				if(array[largestIndex] < array[i]) {
					largestIndex=i;
				}
			}
			swap(array, largestIndex, lastUnsortedIndex);
		}
		System.out.println("Total time in ms: " + (System.currentTimeMillis() - start));
		return array;
	}
	
	private static void swap (int [] array, int i, int j) {
		if(i==j) {
			return;
		}
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static int [] getRandomArrayOfLength(int length) {
		int array [] = new int[length];
		for(int i=0;i<length;i++) {
			array[i] = (int)(Math.random() * 1000);
		}
		return array;
	}
	
}
