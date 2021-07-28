package com.basics;

public class FibonacciRecursion {
	static int n1 = 0, n2 = 1, n3 = 0;

	public static void printFibonaccii(int count) {
		if (count > 0) {
			n3 = n2 + n1;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			printFibonaccii(count - 1);
		}
	}

	public static void main(String[] args) {
		int count = 10;
		System.out.print(n1 + " " + n2);
		printFibonaccii(count - 2);

	}
}
