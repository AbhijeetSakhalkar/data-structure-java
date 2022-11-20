package com.practice.test.sortalgorithms;

import com.practice.sortalgorithms.MergeSort2;
import com.practice.utils.ArrayUtils;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class SortTest extends TestCase {

	public static void main(String[] args) {
        TestRunner.runAndWait(new TestSuite(SortTest.class));
    }

	
	public void testMergeSortMethod() throws Exception {
		
		int array[] = ArrayUtils.getRandomArrayOfLength(10);
		
		MergeSort2.mergeSort(array, 0, array.length);
		
		boolean isSorted = true;
		
		for(int i=0;i<array.length-1;i++) {
			if(array[i]>array[i+1]) {
				isSorted = false;
				break;
			}
		}
    
		assertEquals(isSorted, true);
		
    }
	
}
