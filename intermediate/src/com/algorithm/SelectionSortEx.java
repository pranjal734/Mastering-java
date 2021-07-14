package com.algorithm;

import java.util.Arrays;

public class SelectionSortEx {
	public void selSort(int[] array) {
		for(int i=0;i<array.length;i++) {
			int minIndex =i;
			for(int j=i;j<array.length;j++) {
				if(array[j]<array[minIndex]) {
					minIndex = j;
					swap(array,minIndex,i);
				}
			}
		}
			
	}
	public void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
public static void main(String[] args) {
	int[] numbers = {2,15,7,8,4,6,3,2};
	SelectionSortEx sr = new SelectionSortEx();
	sr.selSort(numbers);
	System.out.println(Arrays.toString(numbers));
}
}
