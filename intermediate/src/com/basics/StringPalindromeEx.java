package com.basics;

import java.util.Scanner;

public class StringPalindromeEx {
public static void main(String[] args) {
	String original,reverse="";
	Scanner s = new Scanner(System.in); 
	 original = s.nextLine();
	int length = original.length();
	for(int i=length-1;i>=0;i--)
		 reverse = reverse+original.charAt(i);
	if(original.equals(reverse)) {
		System.out.println("It is a palindrome no");
	}else {
		System.out.println("Not a palindrome no");
	}
	s.close();
}
}
