package com.algorithm;

public class BinarySearchEx {
	public static int binarySearch(int arr[], int l, int r, int s) {
		if (r >= l) {
			int mid = l + (r - 1) / 2;
			if (arr[mid] == s)
				return mid;
			if (arr[mid] > s)
				return binarySearch(arr, l, mid - 1, s);

			return binarySearch(arr, mid + 1, r, s);
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 40, 60 };
		int s = 20;
		int n = arr.length - 1;
		int result = binarySearch(arr, 0, n - 1, s);
		if (result == -1)
			System.out.println("element is not found");
		else
			System.out.println("element is found at index: " + result);
	}
}
