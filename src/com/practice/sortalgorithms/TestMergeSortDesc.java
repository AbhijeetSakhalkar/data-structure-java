package com.practice.sortalgorithms;

import java.util.Arrays;

import com.practice.utils.ArrayUtils;

public class TestMergeSortDesc {

	public static void main(String [] args) {
		int array [] = ArrayUtils.getRandomArrayOfLength(15);

		mergeSort(array, 0, array.length);

		System.out.println(Arrays.toString(array));
	}


	public static void mergeSort (int [] array, int start, int end) {
		if(end-start < 2) {
			return;
		}
		int mid = (start+end)/2;
		mergeSort(array, start, mid); // Left array
		mergeSort(array, mid, end); // Right array
		merge(array, start, mid, end);
	}

	public static void merge(int[] array, int start, int mid, int end) {

		if(array[mid-1] > array[mid]) return; // 
		int i=start;
		int j=mid;
		int [] tempArray = new int[end-start];
		for(int index=0; index<tempArray.length;index++) {
			if(i<mid && j<end) {
				tempArray[index] = array[i]>array[j]?array[i++]:array[j++];
			}
			else if(i==mid && j<end) {
				tempArray[index] = array[j++];
			}
			else if(i<mid && j==end) {
				tempArray[index] = array[i++];
			}
			else {
				// This should never happen
			}
		}
		
		System.arraycopy(tempArray, 0, array, start, (end-start));
	}


}
