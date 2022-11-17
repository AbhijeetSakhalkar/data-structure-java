package com.practice.sortalgorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int [] array = {3,1,5,1,-1,-3,0};
		System.out.println("Selection Sort:");
		System.out.println(Arrays.toString(sort(array)));

	}
	
	/*
	 * Select the largest element and put it at the last unsorted index
	 */
	private static int [] sort(int [] array) {
		for(int lastUnsortedIndex=array.length-1;lastUnsortedIndex>0;lastUnsortedIndex--) {
			int largestIndex=0;
			for(int i=1;i<=lastUnsortedIndex;i++) {
				if(array[largestIndex] < array[i]) {
					largestIndex=i;
				}
			}
			swap(array, largestIndex, lastUnsortedIndex);
		}
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

}
