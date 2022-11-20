package com.practice.sortalgorithms;

import java.util.Arrays;

import com.practice.utils.ArrayUtils;

public class TestInsertionSortRecursive {

	public static void main(String[] args) {
		int [] array = ArrayUtils.getRandomArrayOfLength(10);
		//System.out.println(Arrays.toString(array));
		System.out.println("Insertion Sort:");
		sort(array, array.length);
		System.out.println(Arrays.toString(array));

	}
	
	private static void sort(int [] array, int numItems) {
		// numItems is how many items to sort
		
		if(numItems < 2) {
			return;
		}
		
		sort(array, numItems-1);
		// Here the assumption is, items till numItems-1 are sortd. We only have to put array[numItems] in the appropriate position
		int subjectElement = array[numItems-1];
		int i = 0;
		
		for(i=numItems-1; i>0&&array[i-1]>subjectElement;i--) {
			array[i] = array[i-1];
		}
		
		array[i] = subjectElement;
		
		System.out.println("Result of call when numItems = " + numItems);
		System.out.println(Arrays.toString(array));
		System.out.println();
		
	}
}
