package com.algorithm;

import java.util.Arrays;

public class insertionSortEx {
	public void insSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int current = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > current) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = current;
		}
	}

	public static void main(String[] args) {
		int[] number = { 4, 2, 9, 6, 8, 5, 1 };
		insertionSortEx ins = new insertionSortEx();
		ins.insSort(number);
		System.out.println(Arrays.toString(number));
	}
}
