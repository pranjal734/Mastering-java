package com.hackerearth;

import java.util.Scanner;

public class StringLexicalEx {
	/*Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .

*/
	public static String getSmallestAndLargest(String s,int k) {
		String sequence = s.substring(0,k);
		String smallest = sequence;
		String largest = sequence;
		for(int i=1;i<=(s.length()-k);i++) {
			sequence = s.substring(i,i+k);
			if(sequence.compareTo(smallest)<0)
				 smallest=sequence;
			if(sequence.compareTo(largest)>0)
				largest=sequence;
		}
	return smallest +"\n"+ largest;
	}
public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
	int k = in.nextInt();
	String s = in.next();
	in.close();
    System.out.println(getSmallestAndLargest(s, k));

}
}
