package com.practice.sortalgorithms;

import java.util.Arrays;

import com.practice.utils.ArrayUtils;

public class MergeSort {

	public static void main(String [] args) {
		int array [] = ArrayUtils.getRandomArrayOfLength(10);
		
		mergeSort(array, 0, array.length);
		
		System.out.println(Arrays.toString(array));
	}
	
	/*
	 * 1. Merge sort is a divide and conquor algorithm
	 * 2. It has 2 phases, splitting and merging. Sorting occurs while merging
	 * 3. Stable sort algorithm
	 * 4. Not an inplace sort algo
	 * 5. Time complexity is nlogn
	 * 6. As it is not an inplace algo (needs temp arrays/variables) s[ace complexity should be considered.
	 */
	public static void mergeSort (int [] array, int start, int end) {
		if(end - start < 2) {
			return;
		}
		
		int mid = (start + end)/2;
		mergeSort(array, start, mid); // here mid is excluded
		mergeSort(array, mid, end); // end is excluded
		merge(array, start, mid, end);
	}

	public static void merge(int[] array, int start, int mid, int end) { // mid is the first element in the right side
		
		//Left partition is start to mid-1
		//Right partition is mid to end-1. end is lenght of array
		//Fact -> start to (mid -1) is already sorted and so is mid to (end-1) 
		if(array[mid-1] <= array [mid]) { // If last element of let array is smaller than first element of right, no need to merge (left + right is already sorted)
			return;
		}
		
		int i = start;
		int j = mid;
		int tempIndex=0;
		int [] temp = new int[end-start];
		while (i<mid && j<end) {
			temp[tempIndex++] = array[i] <= array[j] ? array[i++]:array[j++]; // <= makes it stable sort
		}
		
		System.arraycopy(array, i, array, start + tempIndex, mid-i);
		System.arraycopy(temp, 0, array, start, tempIndex);
		
			
	}
	
	
}
