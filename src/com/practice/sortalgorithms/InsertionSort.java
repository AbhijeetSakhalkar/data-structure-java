package com.practice.sortalgorithms;

import java.util.Arrays;

import com.practice.utils.ArrayUtils;

public class InsertionSort {

	public static void main(String[] args) {
		int [] array = ArrayUtils.getRandomArrayOfLength(10);
		//System.out.println(Arrays.toString(array));
		System.out.println("Insertion Sort:");
		sort(array);
		System.out.println(Arrays.toString(array));

	}

	/*
	 * Keep sorted array at left side. pick element and place at the perfect sorted position.
	 */
	private static int [] mySort(int [] array) {
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
	
	private static int [] sort(int [] array) {
		long start = System.currentTimeMillis();
		
		for(int firstUnsortedIndex = 1; firstUnsortedIndex < array.length ; firstUnsortedIndex ++) {
			int i;
			int subjectElement = array[firstUnsortedIndex] ; 
			for(i=firstUnsortedIndex ; i>0 && array[i-1] > subjectElement ; i--) {
				array[i] = array[i-1];
			}
			array[i] = subjectElement;
		}
		
		System.out.println("Total time in ms: " + (System.currentTimeMillis() - start));
		return array;
	}
}
