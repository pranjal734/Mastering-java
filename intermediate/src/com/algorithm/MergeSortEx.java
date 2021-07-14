package com.algorithm;

import java.util.Arrays;

public class MergeSortEx {
	public void mergSort(int[] array) {
		int middle = array.length / 2;
		int[] left = new int[middle];
		for (int i = 0; i < middle; i++)
			left[i] = array[i];
		int[] right = new int[array.length - middle];
		for (int i = middle; i < array.length; i++)
			right[i - middle] = array[i];
		sort(left);
		sort(right);
	}

	private void merge(int[] left, int[] right, int[] result) {
		int i = 0;
		j = 0;
		k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] <= right[j])
				result[k++] = left[i++];
			else
				result[k++]=right[j++];
		}
	}

	public static void main(String[] args) {
		int[] number = { 12, 1, 5, 9, 7, 5, 3 };
		MergeSortEx ms = new MergeSortEx();
		ms.mergSort(number);
		System.out.println(Arrays.toString(number));
	}
}
