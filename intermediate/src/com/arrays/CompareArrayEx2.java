package com.arrays;
import java.util.Arrays;

public class CompareArrayEx2 {
	
public static void main(String[] argv) throws Exception {
	      boolean flag = Arrays.equals(new int[] { 45, 12, 90 }, new int[] { 45, 12, 90 });
	      System.out.println("The two int arrays are equal? " + flag);
	   }
	}