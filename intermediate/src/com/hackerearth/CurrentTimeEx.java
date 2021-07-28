package com.hackerearth;
import java.io.*;

public class CurrentTimeEx {
public static void main(String[] args) {

	long start = System.currentTimeMillis();
	 countFunction(1000000);
	long end = System.currentTimeMillis();
	System.out.println("time taken by function: "+(end-start)+"ms");
}
public static void countFunction(long x) {

	System.out.println("loop start");
		for(long i=0;i<x;i++);
		System.out.println("loop ends");
			
}
}
