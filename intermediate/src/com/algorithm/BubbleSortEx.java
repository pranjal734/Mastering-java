package com.algorithm;

import java.util.Arrays;

public class BubbleSortEx {
	public void bSort(int[] array) {
		boolean isSorted;
		for (int i = 0; i < array.length; i++) {
			isSorted = true;
			for (int j = 1; j < array.length-i; j++) {
				if (array[j] < array[j - 1]) {
					swap(array, j, j - 1);
				isSorted=false;
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
		int[] numbers = { 7, 3, 8, 5, 6, 2, 6 };
		BubbleSortEx bs = new BubbleSortEx();
		bs.bSort(numbers);
		System.out.println(Arrays.toString(numbers));
	}
}
