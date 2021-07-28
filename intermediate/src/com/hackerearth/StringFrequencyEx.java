package com.hackerearth;

import java.util.Scanner;

public class StringFrequencyEx {
	public static boolean isAnagram(String a, String b) {
		char aa[] = a.toLowerCase().toCharArray();
		char bb[] = b.toLowerCase().toCharArray();
		if (a.length() != b.length()) {
			return false;
		} else {
			java.util.Arrays.sort(aa);
			java.util.Arrays.sort(bb);
			return java.util.Arrays.equals(aa, bb);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		boolean retri = isAnagram(a, b);
		System.out.println((retri) ? "Anagram" : "Not Anagram");
	}
}
