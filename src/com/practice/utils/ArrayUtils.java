package com.practice.utils;

public class ArrayUtils {

	public static int [] getRandomArrayOfLength(int length) {
		int array [] = new int[length];
		for(int i=0;i<length;i++) {
			array[i] = (int)(Math.random() * 1000);
		}
		return array;
	}
	
}
