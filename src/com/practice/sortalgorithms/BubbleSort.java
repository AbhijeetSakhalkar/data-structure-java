package com.practice.sortalgorithms;

import java.util.Arrays;

import com.practice.utils.ArrayUtils;

public class BubbleSort {

	public static void main(String[] args) {
		
		int [] array = ArrayUtils.getRandomArrayOfLength(10);
		System.out.println("Bubble Sort:");
		sort(array);
		System.out.println(Arrays.toString(array));
	}
	
	
	/*
	 * Bubble up the largest element
	 */
	private static int [] sort(int [] array) {
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
		return array;
	}
}
