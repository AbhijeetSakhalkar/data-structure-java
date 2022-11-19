package com.practice.sortalgorithms;

import java.util.Arrays;

import com.practice.utils.ArrayUtils;

public class BubbleSort {

	public static void main(String[] args) {
		
		int [] array = ArrayUtils.getRandomArrayOfLength(10000);
		//System.out.println(Arrays.toString(array));
		System.out.println("Bubble Sort:");
		sort(array);
	}
	
	
	/*
	 * Bubble up the largest element
	 */
	private static int [] sort(int [] array) {
		long start = System.currentTimeMillis();
		int last = array.length-1;
		for(int j=last ; j>0 ; j--) {
			for(int i=0; i<j;i++) {
				if(array[i] > array [i+1]) {
					int tmp = array[i];
					array[i] = array[i+1];
					array[i+1] = tmp;
				}
			}
		}
		System.out.println("Total time in ms: " + (System.currentTimeMillis() - start));
		return array;
	}
}
