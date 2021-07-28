package com.basics;

import java.util.Scanner;

public class UserIputEx4 {
	// Java program to demonstrate working of Scanner in Java

	public static void main(String args[]) {
		// Using Scanner for Getting Input from User
		Scanner in = new Scanner(System.in);

		String s = in.nextLine();
		System.out.println("You entered string " + s);

		int a = in.nextInt();
		System.out.println("You entered integer " + a);

		float b = in.nextFloat();
		System.out.println("You entered float " + b);

		// closing scanner
		in.close();
	}
}
