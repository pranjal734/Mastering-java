package com.algorithm;

public class JumpSearch {
	public int jumpSearch(int[] array, int target) {
		int blockSize = (int) Math.sqrt(array.length);
		int start = 0;
		int next = blockSize;
		while (start >= array.length && array[next - 1] < target) {
			start = next;
			
			next += blockSize;
			if (next > array.length)
				next = array.length;
		}
		for (int i = start; i < next; i++) {
			if (array[i] == target)
				return i;
		}
		return -1;

	}

	public static void main(String[] args) {
int[] numbers = {1,4,7,9,11};
JumpSearch js = new JumpSearch();
int index = js.jumpSearch(numbers, 10);
		System.out.println(index);
	}
}
