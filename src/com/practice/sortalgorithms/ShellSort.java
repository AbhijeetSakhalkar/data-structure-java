package com.practice.sortalgorithms;

import java.util.Arrays;

import com.practice.utils.ArrayUtils;

public class ShellSort {

	public static void main(String[] args) {
		int [] array = ArrayUtils.getRandomArrayOfLength(10);
		System.out.println(Arrays.toString(sort(array)));
	}
	
	public static int [] sort (int [] array) {
		for(int gap = array.length/2;gap>0; gap /= 2) {
			for(int i=gap;i<array.length;i++) {
				int subjectElement = array[i];
				int j=i;
				while(j>=gap && array[j-gap]>subjectElement) {
					array[j] = array[j-gap];
					j -= gap;
				}
				array[j] = subjectElement;
			}
		}
		return array;
	}

}
