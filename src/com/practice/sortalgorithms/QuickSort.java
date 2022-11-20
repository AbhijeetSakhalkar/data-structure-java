package com.practice.sortalgorithms;

import java.util.Arrays;

import com.practice.utils.ArrayUtils;

public class QuickSort {

	public static void main(String args []) {
		int [] array = ArrayUtils.getRandomArrayOfLength(10);
		quickSort(array, 0, array.length);
		System.out.println(Arrays.toString(array));
	}
	
	/*
	 * 1. Merge sort chooses a pivot, and everything smaller to pivot is to the left and larger to the pivit is the right. Hence, pivod is in correct position
	 * 2. Is an inppplace sort
	 * 3. nlogn
	 * 4. Unstable algorithm
	 */
	public static void quickSort(int [] array, int start, int end) {
		if(end - start < 2) { // this means this is one element array
			return;
		}
		int pivotIndex = partition(array, start, end);
		quickSort(array, start, pivotIndex);
		quickSort(array, pivotIndex+1, end);
	}
	
	public static int partition(int [] array, int start, int end) {
		// This is using the first index of pivot at the start
		int pivot = array[start];
		int i = start;
		int j = end;
		
		while(i<j) {
			// Note: empty loop body
			// find right element either less than the pivt or i crosses j
			while(i<j && array[--j]>= pivot);
			if(i<j) {
				array[i] = array[j];
			}
			// Note: empty loop body
			// find left element either greater than the pivt or i crosses j
			while(i<j && array[++i]<=pivot);
			if(i<j) {
				array[j] = array[i];
			}
		}
		array[j] = pivot;
		return j;
	}
}
