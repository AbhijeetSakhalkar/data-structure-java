package com.practice.sortalgorithms;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int [] array = {3,1,5,1,-1,-3,0};
		System.out.println(Arrays.toString(sort(array)));
	}

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
